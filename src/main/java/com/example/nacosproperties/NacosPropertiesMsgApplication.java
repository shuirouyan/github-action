package com.example.nacosproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NacosPropertiesMsgApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =  SpringApplication.run(NacosPropertiesMsgApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("nacos.val");
        String userAge = applicationContext.getEnvironment().getProperty("nacos.val");
        System.err.println("nacos.val :"+userName+"; nacos.val: "+userAge);
    }

}
