// File: OtherPackageClass.java
package com.anotherpackage;

import com.example.MyClass;

public class OtherPackageClass {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        
        // Accessing the public field and method from a different package
        myObject.publicField = 20;
        System.out.println("Public field value from OtherPackageClass: " + myObject.publicField);
        myObject.publicMethod();
    }
}
