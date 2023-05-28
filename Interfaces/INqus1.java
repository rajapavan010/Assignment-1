interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod in MyClass");
    }
}

public class INqus1 {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.myMethod();
    }
}
