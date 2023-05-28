import java.util.Scanner;

class A {
    private int dataA;

    public A() {
        dataA = 10;
    }

    public void methodA1() {
        System.out.println("Method A1 in class A");
    }

    public void methodA2() {
        System.out.println("Method A2 in class A");
    }

    public void overrideMethod() {
        System.out.println("Override method in class A");
    }
}

class B extends A {
    private int dataB;

    public B() {
        dataB = 20;
    }

    public void methodB1() {
        System.out.println("Method B1 in class B");
    }

    public void methodB2() {
        System.out.println("Method B2 in class B");
    }

    @Override
    public void overrideMethod() {
        System.out.println("Override method in class B");
    }
}

class C extends B {
    private int dataC;

    public C() {
        dataC = 30;
    }

    public void methodC1() {
        System.out.println("Method C1 in class C");
    }

    public void methodC2() {
        System.out.println("Method C2 in class C");
    }

    @Override
    public void overrideMethod() {
        System.out.println("Override method in class C");
    }
}

public class Iqus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        A objectA = new A();
        objectA.methodA1();
        objectA.methodA2();
        objectA.overrideMethod();

        B objectB = new B();
        objectB.methodA1();
        objectB.methodB1();
        objectB.overrideMethod();

        C objectC = new C();
        objectC.methodA1();
        objectC.methodB1();
        objectC.methodC1();
        objectC.overrideMethod();

        A referenceAB = new B();
        referenceAB.overrideMethod();

        A referenceAC = new C();
        referenceAC.overrideMethod();

        scanner.close();
    }
}
