package com.yqj.pattern.factory.abstractfactory.pizza;

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setPizzaName("伦敦奶酪pizza");
        System.out.println(pizzaName + "准备制作");
    }
}