package com.adv.java.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {

    public static void main(String[] args) {
        java.util.Queue<String> line = new LinkedList<>();
        line.add("Mike");
        line.add("Isabel");
        line.add("Jenny");
        line.add("Mann");

        processAlphabetically(line);
    }

    public static void processAlphabetically(java.util.Queue<String> queue) {

        java.util.Queue<String> pq = new PriorityQueue<>();
        for(String element: queue) {
            System.out.println(element);
            pq.offer(element);
        }
        System.out.println("****");
        while(pq.peek() != null) {
            String headElement = pq.poll();
            System.out.println(headElement);
        }
    }

}
