public class Squs1 {

  static String staticVar1 = "Static variable 1";
  static int staticVar2 = 10;

  String instanceVar1 = "Instance variable 1";
  int instanceVar2 = 20;

  static void printStaticVariables() {
    System.out.println("Static variable 1: " + staticVar1);
    System.out.println("Static variable 2: " + staticVar2);
  }

  static void callInstanceMethod(Squs1 myObject) {
    System.out.println("Calling instance method from static method");
    myObject.printInstanceVariables();
  }

  void printInstanceVariables() {
    System.out.println("Instance variable 1: " + instanceVar1);
    System.out.println("Instance variable 2: " + instanceVar2);
  }

  void callStaticMethod() {
    System.out.println("Calling static method from instance method");
    Squs1.printStaticVariables();
  }

  public static void main(String[] args) {

    Squs1 myObject = new Squs1();

    Squs1.printStaticVariables();

    myObject.printInstanceVariables();

    Squs1.callInstanceMethod(myObject);

    myObject.callStaticMethod();
  }
}
