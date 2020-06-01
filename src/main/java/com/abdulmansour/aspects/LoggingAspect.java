package com.abdulmansour.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static int count = 0;

    @Before("execution(public void add*())")
    public void beforeAddAccountAdvice() {
        System.out.println("=======> Executing @Before advice on add*() " + ++count);
    }
}
