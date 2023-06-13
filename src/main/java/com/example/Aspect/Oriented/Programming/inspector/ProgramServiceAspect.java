package com.example.Aspect.Oriented.Programming.inspector;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Aspect
public class ProgramServiceAspect {


    @Before("execution(* com.example.Aspect.Oriented.Programming.service.ProgramService.startProgram(..))")
    public void programStarting(JoinPoint joinPoint) {
        System.out.println("Program is starting...");
        System.out.println("JoinPoint: " + joinPoint.getSignature());
    }
    
    @After("execution(* com.example.Aspect.Oriented.Programming.service.ProgramService.startProgram(..))")
    public void programEnding(JoinPoint joinPoint) {
        System.out.println("Program has been shut down...");
        System.out.println("JoinPoint: " + joinPoint.getSignature());

    }

}
