package com.example.practice15.loggers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RepositoryExecutionTimeLoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(RepositoryExecutionTimeLoggingAspect.class);

    @Before("execution(* com.example.practice15.repositories..*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.debug("Entering method: {} with arguments: {}", joinPoint.getSignature().toShortString(), joinPoint.getArgs());
    }

    @Around("execution(* com.example.practice15.repositories..*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        logger.debug("Method {} executed in {} ms", joinPoint.getSignature().toShortString(), elapsedTime);
        return result;
    }
}
