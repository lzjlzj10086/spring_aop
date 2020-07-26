package com.aop_anno;

import org.springframework.stereotype.Component;

@Component("target01")
public class Target {

    public void save() {
        System.out.println("save runng...............");
    }
}
