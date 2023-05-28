package com.example.childpackage;

import com.example.MyClass;

public class ChildClass extends MyClass {
    public static void main(String[] args) {
        ChildClass childObject = new ChildClass();
        
        childObject.protectedField = 20;
        System.out.println("Protected field value in ChildClass: " + childObject.protectedField);
        childObject.protectedMethod();
    }
}

