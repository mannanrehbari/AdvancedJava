package com.adv.java.generics.lowerbounds;


/*
* Lower Bound restricts the wildcard to a class/interface and any of its parent types
*
* CANNOT be used with generic type params, only wildcards
* it cannot have a lower AND upper bound
*
* UpperBound - use when variable is serving some data to our code
* LowerBound - when the variable is receiving data
*
* super keyword to restrict the argument
*
* */
public class LowerBound {
    public static void main(String[] args) {
        Bus<Student> studentBus = new Bus<>(new Student("Mike", "Math"));
        Bus<SchoolPerson> personBus = new Bus<>(new SchoolPerson("Jerry"));
        transferData(studentBus, personBus);
    }

    public static void transferData(Bus<? extends Student> src, Bus<? super SchoolPerson> dsc) {
        System.out.print("dsc bus rider before switch: ");
        dsc.printRider();
        Student studentInSrcBus = src.getRider();
        System.out.print("dsc bus rider after switch: ");
        dsc.setRider(studentInSrcBus);
        dsc.printRider();
    }




}
