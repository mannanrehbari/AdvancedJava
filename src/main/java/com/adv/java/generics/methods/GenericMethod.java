package com.adv.java.generics.methods;

public class GenericMethod {

    public static void main(String[] args) {
        String test1 = "test1";
        double test2 = 5.32;

        boolean isTest1Double = isDouble(test1);
        boolean isTest2Double = isDouble(test2);

        System.out.println(isTest1Double);
        System.out.println(isTest2Double);

    }


    public static <T> boolean isDouble(T obj) {
        return obj instanceof Double;
    }

}
