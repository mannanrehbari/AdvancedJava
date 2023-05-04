package com.adv.java.collections;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        List<Integer> myInts = new ArrayList<>();
        Random random = new Random();

        for(int i =0; i < 20; i++) {
            myInts.add(random.nextInt(5));
        }
        System.out.println(myInts.toString());

        Map<Integer, Integer> intCount = countNumbers(myInts);
        for(Map.Entry<Integer, Integer> entry: intCount.entrySet()) {
            System.out.println("Integer: "+ entry.getKey()+" appears: "+ entry.getValue());
        }
    }

    public static Map<Integer, Integer> countNumbers(List<Integer> list) {
        Map<Integer, Integer> intCount = new TreeMap<>();
        for(Integer each: list) {
            if(intCount.get(each) == null) {
                intCount.put(each, 1);
            } else {
                intCount.put(each, intCount.get(each)+1);
            }
        }
        return intCount;
    }



}
