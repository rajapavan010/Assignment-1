import java.util.Scanner;

abstract class AbstractClass {
    abstract void abstractMethod();
    
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method.");
    }
}

class ConcreteClass extends AbstractClass {
    @Override
    void abstractMethod() {
        System.out.println("This is an implementation of the abstract method.");
    }
}

public class ABqus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        ConcreteClass concreteObject = new ConcreteClass();
        
        concreteObject.nonAbstractMethod();
        
        concreteObject.abstractMethod();
        
        scanner.close();
    }
}
