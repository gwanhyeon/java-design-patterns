package StrategyPattern;

import StrategyPattern.Weapon;

public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("Knife Attack!");
    }
}
