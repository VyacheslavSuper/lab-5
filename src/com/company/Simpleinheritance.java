package com.company;

public class Simpleinheritance {

    public static void doNasledovanie(){
        A superob = new A();
        B subOb = new B();
        superob.setI(10);
        superob.setJ(9);
        superob.showij();
        System.out.println();
        subOb.setI(3);
        subOb.setJ(5);
        subOb.setK(8);
        subOb.showij();
        subOb.showk();
        System.out.println();
        subOb.sum();
    }

}
