package com.adv.java.generics.upperbounds;

public class UpperBound {

    public static void main(String[] args) {
        NumBox<Integer> intBox = new NumBox<>(2);
        NumBox<Double> doubleBox = new NumBox<>(2.0);
//        NumBox<String> stringNumBox = new NumBox<String>("Test"); error because String does not extend Number
        System.out.println(intBox.getData());
        System.out.println(doubleBox.getData());

    }
}
