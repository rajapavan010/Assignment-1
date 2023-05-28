abstract class AbstractClass {
  abstract void abstractMethod();
}

class SubClass extends AbstractClass {
  @Override
  void abstractMethod() {
      System.out.println("This is an implementation of the abstract method.");
  }
  
  void nonAbstractMethod() {
      System.out.println("This is a non-abstract method.");
  }
  
  void callNonAbstractMethod() {
      nonAbstractMethod();
  }
}

public class ABqus4 {
  public static void main(String[] args) {
      SubClass subObject = new SubClass();
      subObject.callNonAbstractMethod();
  }
}
