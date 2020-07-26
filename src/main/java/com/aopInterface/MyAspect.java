package com.aopInterface;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void Mybefore(){
        System.out.println("前置通知。。。。。。。。");
    }
    public void afterRetruning(){
        System.out.println("后置通知。。。。。。。。");
    }
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前。。。。。。。。");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后。。。。。。。。。");
    }
    public void throwing(){
        System.out.println("异常。。。。。。。。");
    }
    public void after(){
        System.out.println("最终。。。。。。。。");
    }
}
