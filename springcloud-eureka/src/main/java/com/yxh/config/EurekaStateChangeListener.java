package com.yxh.config;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author : yangxh
 * @version V1.0
 * @Project: parentPro
 * @Package com.yxh.config
 * @Description: 对于服务的上下线进行监控，上下线可以进行邮件通知
 * @date Date : 2019年04月07日 21:29
 */
@Component
public class EurekaStateChangeListener {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event){
        System.err.println(event.getServerId() +"\t"+event.getAppName()+"服务下线");
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event){
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.err.println(instanceInfo.getAppName()+"进行注册");
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event){
        System.err.println(event.getServerId() +"\t"+event.getAppName()+"服务进行续约");
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event){
        System.err.println("注册中心 启动");
    }
    @EventListener
    public void listen(EurekaServerStartedEvent event){
        System.err.println("Eureka server 启动");
    }

}
