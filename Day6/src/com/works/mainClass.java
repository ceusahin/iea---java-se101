package com.works;

import java.rmi.AccessException;

public class mainClass {
    public static void main(String[] args) {
        String name = "hakan";
        AccessModifiers access = new AccessModifiers();
        access.age = 77;
        access.name = "Ali";
        access.year = 2020;
        int size = access.count();
        System.out.println(size);

    }
}
