package com.anotherpackage;

import com.example.childpackage.ChildClass;

public class OtherClass {
    public static void main(String[] args) {
        ChildClass childObject = new ChildClass();
        childObject.protectedField = 30;
        System.out.println("Protected field value in ChildClass from OtherClass: " + childObject.protectedField);
        childObject.protectedMethod();
    }
}
