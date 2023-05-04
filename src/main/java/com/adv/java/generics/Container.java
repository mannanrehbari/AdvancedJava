package com.adv.java.generics;

public class Container<X> {
    private X data;

    public Container(X data){
        this.data = data;
    }
    public X getData() {
        return data;
    }
    public void setData(X data) {
        this.data = data;
    }
}


