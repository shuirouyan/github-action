package com.example.nacosproperties.interfaces.impl;

import com.example.nacosproperties.interfaces.SPIInterface;

import java.time.LocalDateTime;

/**
 * @author kangchen
 * @date 2024/10/28 17:56
 */
public class SPIInterfaceImpl implements SPIInterface {
    @Override
    public String message() {
        return LocalDateTime.now().toString();
    }
}
