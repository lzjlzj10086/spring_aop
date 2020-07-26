package com.aop_anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myaspect01")
@Aspect
public class MyAspect {
    @Before("pontcut()")
    public void Mybefore(){
        System.out.println("前置通知。。。。。。。。");
    }
    @AfterReturning("execution(* com.aop_anno.*.*(..))")
    public void afterRetruning(){
        System.out.println("后置通知。。。。。。。。");
    }
    @Around("execution(* com.aop_anno.*.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前。。。。。。。。");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后。。。。。。。。。");
    }
    @AfterThrowing("execution(* com.aop_anno.*.*(..))")
    public void throwing(){
        System.out.println("异常。。。。。。。。");
    }
    @After("MyAspect.pontcut()")
    public void after(){
        System.out.println("最终。。。。。。。。");
    }

    /**
     * 切点表达式的抽取
     */
    @Pointcut("execution(* com.aop_anno.*.*(..))")
    public void pontcut(){}
}
