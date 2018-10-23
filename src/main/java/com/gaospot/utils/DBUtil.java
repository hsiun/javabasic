package com.gaospot.utils;


import java.sql.*;

/**
 * Created by gao on 2018/10/17.
 */
public class DBUtil {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/capes";
    private static final String UNAME = "root";
    private static final String PWD = "newpass";

    private static Connection conn = null;

    static {
        try {
            //加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");

            //获取数据库连接
            conn = DriverManager.getConnection(URL, UNAME, PWD);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }


    /**
     * 关闭Connection
     * @param conn
     */
    public static void closeConn(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 关闭PreparedStatement和ResultSet
     * @param pst
     * @param rs
     */
    public static void closeOther(PreparedStatement pst, ResultSet rs) {
        try {
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

