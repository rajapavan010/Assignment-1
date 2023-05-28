import java.util.InputMismatchException;
import java.util.Scanner;

interface Interface1 {
    void method1();
}
interface Interface2 {
    void method2();
}
class MyClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a value: ");
            int value = scanner.nextInt();
            System.out.println("You entered: " + value);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer value.");
        }
    }

    @Override
    public void method2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

public class INqus4 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.method1();
        myObject.method2();
    }
}
