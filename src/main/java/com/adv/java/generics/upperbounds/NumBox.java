package com.adv.java.generics.upperbounds;

// upper bound is Number - restricted to children of Number
public class NumBox <T extends Number> {
    private T data;

    public NumBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
