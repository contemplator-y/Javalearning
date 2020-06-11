package com.yang.www;

import java.lang.*;
public class Area {
    public static void main(String[] args) {
            //圆的面积
            double a = 2.5;
            Area(a, 1);
            //长方形的面积
            double b = 3.2, c = 2.0;
            Area(b, c);
            //三角形的面积
            double d = 3.0, e = 4.0, f = 5.0;
            Area(d, e, f);
            //圆的面积
            double r = 2.0;
            Area(r, 0);
    }

    //求正方形的面积和圆的面积(flag为1表示正方形，为0表示圆）
    static void Area(double a, int flag) {
        if (flag == 1) {
            System.out.println("边长为" + a + "的正方形的面积为：" + a * a);
            return;
        }
        double pi = 3.1415926;
        System.out.println("半径为" + a + "的圆的面积为：" + pi * a * a);
    }
    //求长方形的面积
    static void Area(double a, double b) {
        System.out.println("长为" + a + "宽为" + b + "的长方形的面积为：" + a * b);

    }
    //求三角形的面积
    static void Area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double tmp = p * (p - a) * (p - b) * (p - c);
        System.out.println("边长分别为："+ a +',' + b + ','+ c + "的三角形形的面积为：" + Math.sqrt(tmp) );

    }
}
