interface Interface1 {
  void commonMethod();
}
interface Interface2 {
  void commonMethod();
}
class MyClass implements Interface1, Interface2 {
  @Override
  public void commonMethod() {
      System.out.println("Calling commonMethod() from MyClass");
  }
}

public class INqus5 {
  public static void main(String[] args) {
      MyClass myObject = new MyClass();
      Interface1 interface1 = myObject;
      interface1.commonMethod();
      Interface2 interface2 = myObject;
      interface2.commonMethod();
  }
}
