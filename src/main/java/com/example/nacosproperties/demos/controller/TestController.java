package com.example.nacosproperties.demos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangchen
 * @date 2024/9/18 17:25
 */
@RestController
//@NacosPropertySource(dataId = "nacosdemo", type = ConfigType.PROPERTIES, autoRefreshed = true)
@RefreshScope
public class TestController {
    @Value(value = "${nacos.val:0}")
    private String nacosVal;

    @GetMapping("/get")
    public String get() {
        return nacosVal;
    }
}
