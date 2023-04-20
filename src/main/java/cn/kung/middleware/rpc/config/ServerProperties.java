package cn.kung.middleware.rpc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author kung
 * @Date 2023-04-20
 * @Version 1.0.0
 * @Description 注册中心配置
 **/
@ConfigurationProperties("rpc.server")
public class ServerProperties {

    private String host; //注册中心地址
    private int port; //注册中心端口

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


}
