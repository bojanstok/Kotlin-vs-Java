package com.stok;

/**
 * Created by stok on 21.6.2017.
 */
public class DemoA {

    public static void main(String[] args) {
        System.out.println("helloA");
        DemoB b = new DemoB();
        System.out.println("res: " + b.doit());
        System.out.println(b.sum(2, 4));
        Person p = new Person("Joe", 20);
        System.out.println(p);
    }

    public Boolean what() {
        return true;
    }
}

