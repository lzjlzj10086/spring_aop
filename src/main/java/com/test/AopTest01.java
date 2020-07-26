package com.test;

import com.aopInterface.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest01 {

    @Resource
    private TargetInterface target;

    @Test
    public void test01(){
        target.save();
    }
}
