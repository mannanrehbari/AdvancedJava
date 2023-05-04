package com.adv.java.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

// Deque - Double Ended queue
public class Deck {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(9, 13, 2, 1, 11, 39, 78, 4);
        Deque<Integer> separated = separateInts(myInts);
        separated.forEach(System.out::println);
    }

    public static Deque<Integer> separateInts(List<Integer> integers) {
        Deque<Integer> separatedDeque = new ArrayDeque<>();
        integers.forEach( (myInt) -> {
            if(myInt%2==0) {
                separatedDeque.addFirst(myInt);
            } else {
                separatedDeque.addLast(myInt);
            }
        });
        return separatedDeque;
    }



}
