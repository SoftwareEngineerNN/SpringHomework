package com.spring3.aspect;


import com.spring3.exception.FoodExpiredDateException;
import com.spring3.exception.IncorrectFoodTypeException;
import com.spring3.zoo.Animal;
import com.spring3.zoo.food.Food;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class AnimalAspect {



    @Pointcut("execution (* com.spring3.zoo.*.*(..))")
    public void anyAnimalMethod() {
    }

    @Pointcut("within (com.spring3.zoo.*)")
    public void anyAnimalMethodWithWithIn() {
    }

    @Pointcut("@annotation(com.spring3.aspect.annotationMarker.Marker)")
    public void annotationPointcut() {
    }

    @Pointcut("@within(com.spring3.aspect.annotationMarker.Marker)")
    public void annotationWithInPointcut() {
    }

    @Pointcut("args(food)")
    public void withArg(Food food) {
    }

    @Before("com.spring3.aspect.Pointcuts.voicePoint()")
    public void beforeVoice(JoinPoint joinPoint) {
        System.out.println("beforeVoice");
    }

    @Before(value = "anyAnimalMethod() && withArg(food)", argNames = "food")
    public void beforeSetFood(Food food) {
        System.out.println(food.toString());
    }

    @Before(value = "annotationWithInPointcut()")
    public void beforeServiceCall(JoinPoint joinPoint) {
        System.out.println("beforeVoice");
    }

    @AfterReturning(value = "execution(* com.spring3.zoo.Animal.getAge())", returning = "age")
    public void afterReturningExample(Integer age) {
        System.out.println(age);
    }

    @AfterThrowing(value = "execution(* com.spring3.zoo.Animal.throwException())", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println(e.getMessage());
    }

    @Before(value = "com.spring3.aspect.Pointcuts.feedPoint() && withArg(food)", argNames = "joinPoint,food")
    public void beforeFeedingAspect(JoinPoint joinPoint, Food food)  {

        if (food.getExpiredDate().isBefore(LocalDateTime.now())) {
            throw new FoodExpiredDateException();
        }
            Animal animal = (Animal) joinPoint.getTarget();
            if (!animal.getPossibleFoodType().contains(food.getFoodType())) {
                throw new IncorrectFoodTypeException();
            }

    }
}
