import java.util.Scanner;

class ParentClass {
    protected int parentNumber;

    public ParentClass(int parentNumber) {
        this.parentNumber = parentNumber;
    }

    public void printFields() {
    }
}

class MyClass extends ParentClass {
    private int myNumber;
    private String myText;

    public MyClass(int myNumber, String myText) {
        super(0);
        this.myNumber = myNumber;
        this.myText = myText;
    }

    public void printFields() {
        System.out.println("MyNumber: " + myNumber);
        System.out.println("MyText: " + myText);
        System.out.println("ParentNumber: " + parentNumber);
    }

    public void methodWithThis() {
        System.out.println("Method with this():");
        this.printFields();
    }

    public void methodWithSuper() {
        System.out.println("Method with super():");
        super.printFields();
    }
}

public class TSqus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the MyNumber: ");
        int myNumber = scanner.nextInt();

        System.out.print("Enter the MyText: ");
        String myText = scanner.next();

        MyClass myObj = new MyClass(myNumber, myText);

        System.out.println("Printing fields using this:");
        myObj.printFields();

        System.out.println("Printing fields of parent class using super:");
        myObj.methodWithSuper();

        System.out.println("Calling constructor using this():");
        System.out.println("Calling argument constructor using this():");
        scanner.close();
    }
}
