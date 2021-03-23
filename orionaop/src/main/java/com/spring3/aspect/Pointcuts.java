package com.spring3.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Pointcuts {

    @Pointcut("execution(* com.spring3.zoo.Animal.voice())")
    public void voicePoint() {
    }

    @Pointcut("execution(* com.spring3.zoo.Animal.feed(..))")
    public void feedPoint() {
    }

}
