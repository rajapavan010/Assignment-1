import java.util.Scanner;

abstract class AbstractClass {
    abstract void abstractMethod();
    
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method.");
    }
}

class SubClass extends AbstractClass {
    @Override
    void abstractMethod() {
        System.out.println("This is an implementation of the abstract method.");
    }
}

public class ABqus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        SubClass subObject = new SubClass();
        
        subObject.nonAbstractMethod();
        
        scanner.close();
    }
}
