abstract class MyAbstractClass {
  public static final String PUBLIC_FIELD = "Public Field";
  protected static final String PROTECTED_FIELD = "Protected Field";
  private static final String PRIVATE_FIELD = "Private Field";

  public abstract void interfaceMethod();
}

class MyClass extends MyAbstractClass {
  @Override
  public void interfaceMethod() {
      System.out.println("Implementation of interfaceMethod()");
  }
}

public class INqus10 {
  public static void main(String[] args) {
      MyClass myObj = new MyClass();

      System.out.println("PUBLIC_FIELD: " + MyAbstractClass.PUBLIC_FIELD);
      System.out.println("PROTECTED_FIELD: " + MyAbstractClass.PROTECTED_FIELD);

      // Private field cannot be accessed outside the abstract class
      // System.out.println("PRIVATE_FIELD: " + MyAbstractClass.PRIVATE_FIELD);

      myObj.interfaceMethod();
  }
}
