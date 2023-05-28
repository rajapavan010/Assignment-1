import java.util.Scanner;

public class Qus4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("Enter two numbers: ");
      int number1 = scanner.nextInt();
      int number2 = scanner.nextInt();
      boolean isEqual = number1 == number2;
      if (isEqual) {
        System.out.println("The numbers are equal.");
      } else {
        System.out.println("The numbers are not equal.");
      }
    }
  }
