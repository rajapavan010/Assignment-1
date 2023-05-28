interface MyInterface {
  static final String INTERFACE_VARIABLE = "Interface Variable";

  void interfaceMethod();
}

class MyClass implements MyInterface {
  @Override
  public void interfaceMethod() {
      System.out.println("Implementation of interfaceMethod()");
  }
}

public class INqus11 {
  public static void main(String[] args) {
      System.out.println("INTERFACE_VARIABLE: " + MyInterface.INTERFACE_VARIABLE);

      MyClass myObj = new MyClass();
      myObj.interfaceMethod();
  }
}
