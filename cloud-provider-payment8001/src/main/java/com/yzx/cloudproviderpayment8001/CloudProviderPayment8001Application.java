package com.yzx.cloudproviderpayment8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 服务入口
 * @Param:
 * @return:
 * @Author: mastermind
 * @Date: 2020-03-15 18:02
 */
@SpringBootApplication
@MapperScan(basePackages = "com.yzx.cloudproviderpayment8001.mapper")
@EnableEurekaClient
public class CloudProviderPayment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001Application.class, args);
    }

}
