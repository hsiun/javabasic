package com.gaospot.tools;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.gaospot.bean.Apple;


/**
 * @author: gaoxiong@asiainfo.com
 * @date: 2019/4/18 11:20 AM
 * @description: 用于模拟dubbo调用的工具类
 */

public class DubboConsumerTask {
    public static void main(String[] args) throws Exception {
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("consumer-ctlm");

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://localhost:2181");

        ReferenceConfig<Apple> reference = new ReferenceConfig<Apple>();
        // 此实例很重，封装了与注册中心的连接以及与提供者的连接，请自行缓存，否则可能造成内存和连接泄漏
        reference.setApplication(application);
        reference.setRegistry(registry);
        // 多个注册中心可以用setRegistries()
        reference.setInterface(Apple.class);
        reference.setVersion("1.0");
        Apple atomActionService = reference.get();

        String invokerGroupList=atomActionService.getName().getBytes().toString();
        if(invokerGroupList==null){
            System.out.println("结果为空！");
        }else{
            System.out.println(invokerGroupList);
        }
        //AtomAction atomAction = new AtomAction();

        reference.destroy();


    }
}
