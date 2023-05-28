package com.example;

public class AnotherClass {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        
        myObject.protectedField = 10;
        System.out.println("Protected field value: " + myObject.protectedField);
        myObject.protectedMethod();
    }
}


