package com.yang.www;

public class Parent {
    double a;
    double b;
    double h;

    Parent(){}
    Parent(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void printInfo() {
        double vol = a * b * h;
        System.out.println("长方体的体积为：" + vol);
        System.out.println("长方体的底面积为：" + a * b);

        if (vol >= 5000) {
            System.out.println("箱子太大了，我扛不动！");
        } else {
            System.out.println("还好，我可以扛起来");
        }
    }
}
