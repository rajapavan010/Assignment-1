import java.util.Scanner;

public class Qus5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int number1= sc.nextInt();
    int number2 = sc.nextInt();
    boolean isGreater10 = number1 > 10 && number2 > 10;
    boolean isGreater10OrEven = number1 > 10 || number2 > 10 || (number1 % 2 == 0 && number2 % 2 == 0);
    boolean isEven = ! (number1 % 2 == 0);
    if (isGreater10) {
      System.out.println("Both numbers are greater than 10.");
    } else {
      System.out.println("At least one number is not greater than 10.");
    }

    if (isGreater10OrEven) {
      System.out.println("At least one number is greater than 10 or even.");
    } else {
      System.out.println("Neither number is greater than 10 or even.");
    }

    if (isEven) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }
  }
}
