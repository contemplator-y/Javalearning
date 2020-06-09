package com.yang.www;

public class Child extends Parent{
    Child(){}
    Child(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public void printInfo() {
        super.printInfo();
    }
}
