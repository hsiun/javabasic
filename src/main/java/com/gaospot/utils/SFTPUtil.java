package com.gaospot.utils;

/**
 * Created by gao on 2018/10/23.
 */


import com.jcraft.jsch.*;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.Properties;

/**
 * 使用jsch库实现的文件操作
 * Created by gao on 2018/10/17.
 */
public class SFTPUtil {
    private static Logger logger = Logger.getLogger(SFTPUtil.class);

    private String host; //连接的主机ip
    private int port = 22;    //连接的端口
    private String username;  //登陆的用户名
    private String password;  //登陆的密码

    private ChannelSftp channelSftp = null;
    private Session session = null;

    public SFTPUtil() {

    }

    public SFTPUtil(String host, String username, String password) {
        this.host = host;
        this.password = password;
        this.username = username;
    }

    public SFTPUtil(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    /**
     * 通过SFTP连接服务器
     */
    public void connect() {
        try {
            JSch jSch = new JSch();
            session = jSch.getSession(username, host,port);
            if (logger.isInfoEnabled()) {
                logger.info("==========会话已创建");
            }
            session.setPassword(password);
            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            session.setConfig(sshConfig);
            session.connect();
            if (logger.isInfoEnabled()) {
                logger.info("==========连接已建立");
            }
            Channel channel = session.openChannel("sftp");
            channel.connect();
            if (logger.isInfoEnabled()) {
                logger.info("===========通道已打开");
            }
            channelSftp = (ChannelSftp) channel;
            if (logger.isInfoEnabled()) {
                logger.info("==============已连接到主机" + host + "。");
            }
        }catch (Exception e) {
            logger.info("==========连接到主机失败" + e.getMessage());
            e.printStackTrace();
        }
    }


    /**
     * 关闭连接
     */
    public void disconnect() {
        if (this.channelSftp != null) {
            if (this.channelSftp.isConnected()) {
                this.channelSftp.disconnect();
                if (logger.isInfoEnabled()) {
                    logger.info("===========断开连接成功。");
                }
            }
        }

        if (this.session != null) {
            if (this.session.isConnected()) {
                this.session.disconnect();
                if(logger.isInfoEnabled()) {
                    logger.info("============会话关闭成功");
                }
            }
        }
    }


    /**
     * 下载文件
     * @param remotePath 需下载文件路径
     * @param remoteFilename 需下载文件的文件名
     * @param localPath 文件保存在本地的路径
     * @param localFilename 文件保存在本地的名字
     * @return
     */
    public boolean downloadFile(String remotePath, String remoteFilename, String localPath, String localFilename) {
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(localPath + localFilename);
            fileOutputStream = new FileOutputStream(file);
            //ChannelSftp方法直接提供通过FileOutputSream将文件写入本地文件的方法
            channelSftp.get(remotePath + remoteFilename, fileOutputStream);
            if (logger.isInfoEnabled()) {
                logger.info("==============下载文件：" + remoteFilename + " 成功");
            }
            return true;

        }catch (SftpException e) {
            logger.info("+++++++++++++远程文件未找到：:" + remotePath + remoteFilename);
            e.printStackTrace();
        }catch (FileNotFoundException e) {
            logger.info("+++++++++++++本地文件未找到： " + localPath + localFilename);
            e.printStackTrace();
        }
        finally {
            if (null != fileOutputStream)
            {
                try{
                    fileOutputStream.close();
                }catch (IOException e) {
                    logger.info("+++++++++++文件输出流关闭失败 " + localFilename);
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /**
     * 上传单个文件
     * @param remotePath 上传到主机的路径
     * @param remoteFilename 上传后保存的文件名
     * @param localPath 待上传文件的本地路径
     * @param localFilename 待上传文件名
     */
    public boolean uploadFile(String remotePath, String remoteFilename, String localPath, String localFilename) {
        FileInputStream fileInputStream = null;

        try {
            createDir(remotePath);
            File file = new File(localPath + localFilename);
            fileInputStream = new FileInputStream(file);
            channelSftp.put(fileInputStream, remoteFilename);
            if (logger.isInfoEnabled()) {
                logger.info("================文件上传成功" +localFilename);
            }
            return true;
        }catch (FileNotFoundException e) {
            logger.info("+++++++++++++本地文件未找到" + localFilename);
            e.printStackTrace();
        }catch (SftpException e) {
            logger.info("+++++++++++++Sftp Exception.");
            e.printStackTrace();
        }finally {
            if (null != fileInputStream) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    logger.info("+++++++++++++文件流关闭失败 " + localFilename);
                    e.printStackTrace();
                }
            }
        }

        return false;
    }

    /**
     * 删除本地文件
     * @param filePath
     * @return
     */
    public boolean deleteFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            logger.info("+++++++++++file error：" + filePath);
            return false;
        }

        if (!file.isFile()) {
            logger.info("+++++++++++is not a file：" + filePath);
            return false;
        }

        boolean rs = file.delete();
        if (rs && logger.isInfoEnabled()) {
            logger.info("==============file delete successful:" + filePath);
        }

        return rs;
    }

    /**
     * 创建目录
     * @param createPath
     * @return
     */
    public boolean createDir(String createPath) {
        try {
            if (isDirExist(createPath)) {
                this.channelSftp.cd(createPath);
                return true;
            }

            String pathArray[] = createPath.split("/");
            StringBuffer filePath = new StringBuffer("/");
            for (String path : pathArray)
            {
                if (path.equals(""))
                {
                    continue;
                }
                filePath.append(path + "/");
                if (isDirExist(filePath.toString()))
                {
                    channelSftp.cd(filePath.toString());
                }
                else
                {
                    // 建立目录
                    channelSftp.mkdir(filePath.toString());
                    // 进入并设置为当前目录
                    channelSftp.cd(filePath.toString());
                }

            }
            this.channelSftp.cd(createPath);
            return true;
        } catch (SftpException e) {
            logger.info("++++++++++++++++++Create path error:" + createPath);
            e.printStackTrace();

        }
        return false;
    }


    public boolean isDirExist(String directory) {
        boolean isDirExistFlay = false;

        try {
            SftpATTRS sftpATTRS = channelSftp.lstat(directory);
            isDirExistFlay = true;
            return sftpATTRS.isDir();
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().equals("no such file")) {
                isDirExistFlay = false;
            }
        }

        return isDirExistFlay;
    }

    public static void main(String[] args) {
        SFTPUtil sftpUtil = null;

        String localPath = "/Users/gao/sftp/";
        String remotePath = "/home/parallels/";

        try {
            sftpUtil = new SFTPUtil("127.0.0.1", "test", "test");
            sftpUtil.connect();
            sftpUtil.downloadFile(remotePath, "2018-09-28.xml", localPath, "2018-09-28.xml");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sftpUtil.disconnect();
        }
    }

}

