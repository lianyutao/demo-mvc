package com.example.mvc.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 拦截器：记录用户操作日志，检查用户是否登录
 * @author Administrator
 *
 */
//@Aspect
//@Component
public class ControllerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ControllerInterceptor.class);
//    @Value("${spring.profiles}")
    private String env;
    /** 
     * 定义拦截规则：拦截com.example.mvc.controller包下面的所有类中，有@RequestMapping注解的方法。 
     */  
//    @Pointcut("execution(* com.example.mvc.controller..*(..)) and @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void controllerMethodPointcut() {}
    
}
	

	