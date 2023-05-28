abstract class Animal {

  abstract void makeSound();

}

class Dog extends Animal {

  @Override
  void makeSound() {
      System.out.println("Woof!");
  }

}

class Cat extends Animal {

  @Override
  void makeSound() {
      System.out.println("Meow!");
  }

}

public class ABqus3 {

  public static void main(String[] args) {

      Animal animal = new Dog();
      animal.makeSound();

      animal = new Cat();
      animal.makeSound();

  }

}
