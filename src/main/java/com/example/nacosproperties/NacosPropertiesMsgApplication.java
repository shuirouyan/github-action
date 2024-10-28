package com.example.nacosproperties;

import com.example.nacosproperties.interfaces.SPIInterface;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;
import java.util.ServiceLoader;

//@SpringBootApplication
public class NacosPropertiesMsgApplication implements ApplicationRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosPropertiesMsgApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("nacos.val");
        String userAge = applicationContext.getEnvironment().getProperty("nacos.val");
        System.err.println("nacos.val :" + userName + "; nacos.val: " + userAge);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ServiceLoader<SPIInterface> load = ServiceLoader.load(SPIInterface.class);
        Iterator<SPIInterface> iterator = load.iterator();
        while (iterator.hasNext()) {
            SPIInterface next = iterator.next();
            System.out.println("next = " + next);
            System.out.println("next.message() = " + next.message());
        }
    }
}
