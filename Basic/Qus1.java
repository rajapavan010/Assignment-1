class MyClass {
  private int myField;

  public MyClass(int initialValue) {
      this.myField = initialValue;
  }

  public void myMethod() {
      System.out.println("This is myMethod.");
  }

  public int addNumbers(int a, int b) {
      return a + b;
  }
}
public class Qus1 {
  public static void main(String[] args) {
      MyClass myObject = new MyClass(5);

      // Call the methods of the object
      myObject.myMethod();

      int result = myObject.addNumbers(2, 3);
      System.out.println("Result: " + result);
  }
}
