package com.adv.java.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MyLambdas {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Tree", "Hello", "World", "Race");

        // 4 letter words, capitalized
        List<String> fourLetterWords = words.stream()
                .filter((word) -> {return word.length() == 4;})
                .map((word) -> word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(fourLetterWords);

    }

}
