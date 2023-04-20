package cn.kung.middleware.rpc.annotation;

import cn.kung.middleware.rpc.config.ServerAutoConfiguration;
import cn.kung.middleware.rpc.config.ServerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author kung
 * @Date 2023-04-20
 * @Version 1.0.0
 * @Description
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({ServerAutoConfiguration.class})
@EnableConfigurationProperties(ServerProperties.class)
@ComponentScan("cn.kung.middleware.*")
public @interface EnableRpc {
}
