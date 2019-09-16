package com.company.duck;

import com.company.fly.FlyWithWings;
import com.company.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("\n---I'm a real readhead duck---");
    }
}
