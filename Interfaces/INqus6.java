interface MyInterface {
  default void myDefaultMethod() {
      System.out.println("This is a default method.");
  }

  void myAbstractMethod();
}
class MyClass implements MyInterface {
  @Override
  public void myAbstractMethod() {
      System.out.println("This is an implementation of the abstract method.");
  }
}

public class INqus6 {
  public static void main(String[] args) {
      MyClass myObj = new MyClass();
      myObj.myDefaultMethod(); 
      myObj.myAbstractMethod();
  }
}
