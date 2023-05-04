package com.adv.java.generics.wildcards;

// generally - avoid wildcard and use type parameters
// when we generalize further - AND don't need strict type checking
public class Wildcard {

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("Hey");
        Container<Integer> integerContainer = new Container<>(22);

        printContainer(stringContainer);
        printContainer(integerContainer);
    }

    // don't need <T> before return type when used wild card
    public static void printContainer(Container<?> container) {
        System.out.println(container.toString());
    }

}
