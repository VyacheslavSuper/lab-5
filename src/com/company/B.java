package com.company;

public class B extends A {
    private int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (getI() + getJ() + k));
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
