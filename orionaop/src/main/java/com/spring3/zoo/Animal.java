package com.spring3.zoo;

import com.spring3.zoo.food.Food;
import com.spring3.zoo.food.FoodType;

import java.util.List;

public interface Animal {
    void voice();

    void feed(Food food);

    void eat();

    boolean isHungry();

    Integer getAge();

    void throwException();

    List<FoodType> getPossibleFoodType();
}
