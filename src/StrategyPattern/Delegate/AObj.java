package StrategyPattern.Delegate;

import StrategyPattern.Interface.AInterface;
import StrategyPattern.Interface.AInterfaceImpl;

public class AObj {
    AInterface aInterface;

    public AObj(){
        aInterface = new AInterfaceImpl();


    }

    public void funcAA(){

        // delegate
        aInterface.funcA();
        aInterface.funcA();



//        System.out.println("funcA");
//        System.out.println("funcA");역
    }
}
