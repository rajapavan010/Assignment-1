interface Animal {
    void speak();
  }
  
  class Dog implements Animal {
    @Override
    public void speak() {
      System.out.println("Woof!");
    }
  }
  
  class Cat implements Animal {
    @Override
    public void speak() {
      System.out.println("Meow!");
    }
  }
  
  public class INqus3 {
    public static void main(String[] args) {
      Animal animal = new Dog();
      animal.speak(); // Woof!
  
      animal = new Cat();
      animal.speak(); // Meow!
    }
  }
  