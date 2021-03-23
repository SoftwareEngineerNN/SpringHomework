package com.spring3.zoo.impl;

import com.spring3.zoo.Animal;
import com.spring3.zoo.food.Food;
import com.spring3.zoo.food.FoodType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Qualifier("catQualifier")
@Getter
@Setter
public class Cat implements Animal {

    private static final List<FoodType> possibleFoodTypes = Collections.singletonList(FoodType.FISH);

    private Food food;
    private Integer age = 3;

    @Override
    public void voice() {
        System.out.println("mi");
    }

    @Override
    public void feed(Food food) {
        this.food = food;
    }

    @Override
    public void eat() {
        food.setValue(food.getValue().subtract(BigDecimal.valueOf(3)));
    }

    @Override
    public boolean isHungry() {
        return food.getValue().compareTo(BigDecimal.ZERO) < 1;
    }

    @Override
    public void throwException() {
        throw new RuntimeException("aaaaa");
    }

    @Override
    public List<FoodType> getPossibleFoodType() {
        return possibleFoodTypes;
    }
}
