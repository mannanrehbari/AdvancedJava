package com.adv.java.serialization;

import java.io.*;

public class Serialization {

    /*
    Serializable Field Objects
    During serialization in Java, associated field objects must be serializable.

    Writing Serialized Objects to a File
    In Java, a serialized object may be written to a file and read using FileOutputStream and FileInputStream.

    writeObject() and readObject()
    In Java, implementing the writeObject() and readObject() will define a customized way of serializing and deserializing an object.

    Serialization
    Serialization is the process of converting an object’s state into a stream of bytes.

    serialVersionUID
    In Java, a class implementing Serializable needs a serialVersionUID to confirm class compatibility during deserialization.

    Serializable Class
    A class (or any of its parent classes) must implement the Serialiazable interface (or any of its children interfaces) in order to be serializable.

    Deserialization
    Deserialization is the process of converting a stream of bytes, created after serialization, back into an object.

    Benefits of Serialization
    Serialization is beneficial when an object needs to be stored or sent over a network.

    Static and Transient Fields
    In Java, any field not marked as static or transient is serializable.
    * */

    public static class Car implements Serializable {

        private static final long serialVersionUID = 1L;
        private String make;
        private int year;
        private transient String model;

        public Car(String make, int year, String model) {
            this.make = make;
            this.year = year;
            this.model = model;
        }

        public String toString(){
            return String.format("Car make is: %s, Car year is: %d, Car model is: %s, serialVersionUID: %d", this.make, this.year, this.model, serialVersionUID);
        }

    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car toyota = new Car("Toyota", 2021, "Camry");
        Car honda = new Car("Honda", 2020, "Civic");
        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);

        FileInputStream fileInputStream = new FileInputStream("cars.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car toyotaCopy = (Car) objectInputStream.readObject();
        Car hondaCopy = (Car) objectInputStream.readObject();
        boolean isSameObject = toyotaCopy == toyota;
        System.out.println("Toyota (Copy) - "+toyotaCopy);
        System.out.println("Toyota (Original) - " + toyota);
        System.out.println("Is same object: " + isSameObject);

    }


}
