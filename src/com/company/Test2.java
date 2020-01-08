package com.company;

public class Test2 {
    private int a;

    public Test2(int a) {
        this.a = a;
    }
    public Test2 incrByTen(){
        return new Test2(a+10);
    }

    @Override
    public String toString() {
        return "Test2{" +
                "a=" + a +
                '}';
    }
}
