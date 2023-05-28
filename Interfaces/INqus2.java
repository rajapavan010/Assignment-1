interface Animal {
  void speak();
  void run();
}

class Dog implements Animal {
  @Override
  public void speak() {
    System.out.println("Woof!");
  }

  @Override
  public void run() {
    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }
}

public class INqus2 {
  public static void main(String[] args) {
    Dog dog = new Dog();

    dog.speak();
  }
}
