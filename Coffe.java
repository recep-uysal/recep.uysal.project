package com.koznem;

public class Coffee extends CoffeeMachine {

    private String name;

    public Coffee(int espresso, int hot_water, int milk_floam, int streamed_milk, int money, String name) {
        super(espresso, hot_water, milk_floam, streamed_milk, money);
        this.name = name;
    }
}