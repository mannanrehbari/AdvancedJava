package com.adv.java.generics;

public class Generics {

    /*
    *
    Universal (Generic) Algorithms
    When using generics in Java, universal (generic) algorithms can be created for different types.

    Generics
    In Java, generics allow classes and interface types to be used as parameters to define classes, interfaces, or methods.

    Avoid Raw types - causes incompatible type error while retrieval

    Benefits of Generics
    In Java, generics allow for stronger type checking and bug detection at compile time.

    Diamond Operators
    When using generics in Java, the diamond operator (<>) is used to declare the type parameter.

    super
    When using generics in Java, the super keyword is used to define a lower bound type on a wildcard.

    Wildcards
    In Java, the wildcard (?) is used to specify an unknown generic type parameter.

    extends
    When using generics in Java, the extends keyword is used to define an upper bound type on type parameter or wildcard.

    Wrapper Classes
    Wrapper classes are provided to allow primitive values to be used with generic code.

    Primitives and generics
    primitives cannot work directly with generics
    use wrapper classes

    * * */

    public static void main(String[] args) {
        String myWord = "Hey there!";
        Book myBook = new Book("Parry Hotter");

        Container<String> wordContainer = new Container<>(myWord);
        Container<Book> bookContainer = new Container<>(myBook);

        System.out.println(wordContainer.getData());
        System.out.println(bookContainer.getData());

    }

}
