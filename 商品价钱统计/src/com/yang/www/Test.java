package com.yang.www;

public class Test {
    public static void main(String[] args) {
        Product p = new Product("beer", 1.5);
        Product p2 = new Product("apple", 1.0);
        p.printTotalprice(10);
        p2.printTotalprice(2.5);
    }
}
