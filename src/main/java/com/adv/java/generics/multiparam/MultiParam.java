package com.adv.java.generics.multiparam;

public class MultiParam {

    public static void main(String[] args) {
        MultiContainer<Integer, Double> multiContainer = new MultiContainer<>(23, 23.0);

        System.out.println(multiContainer.getItem1());
        System.out.println(multiContainer.getItem2());

    }
}
