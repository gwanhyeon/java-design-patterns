package StrategyPattern;

import StrategyPattern.Delegate.AObj;
import StrategyPattern.Interface.AInterface;
import StrategyPattern.Interface.AInterfaceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Class");

        AInterface aInterface = new AInterfaceImpl();
        aInterface.funcA();

        AObj aObj = new AObj();
        aObj.funcAA();

        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Ax());
        character.attack();

    }
}
