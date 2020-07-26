package com.test;

import com.aop_anno.Target;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextAnno.xml")
public class AopTestAnno {

    @Resource
    private Target target;

    @Test
    public void test(){
        target.save();
    }
}
