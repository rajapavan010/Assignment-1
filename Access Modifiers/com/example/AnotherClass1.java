package com.example;

public class AnotherClass1 {
    public static void main(String[] args) {
        MyClass1 myObject = new MyClass1();
        
        myObject.publicField = 10;
        System.out.println("Public field value: " + myObject.publicField);
        myObject.publicMethod();
    }
}
