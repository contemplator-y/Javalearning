package com.yang.www;

public class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void printTotalprice(int num) {
        System.out.println(name + '\t' + "$:" + price + '\t' +
                "num:" + num + '\t' + "Totalprice:" + num * price);
    }

    public void printTotalprice(double weight) {
        System.out.println(name + '\t' + "$:" + price + '\t' + "weights:"
                + weight + '\t' + "Totalprice:" + weight * price);
    }

}
