public class Qus1 {
  public static void main(String[] args) {
      int a = 10;
      int b = 5;

      int sum = add(a, b);
      int difference = subtract(a, b);
      int product = multiply(a, b);
      double quotient = divide(a, b);

      System.out.println("Sum: " + sum);
      System.out.println("Difference: " + difference);
      System.out.println("Product: " + product);
      System.out.println("Quotient: " + quotient);
  }

  public static int add(int a, int b) {
      return a + b;
  }

  public static int subtract(int a, int b) {
      return a - b;
  }

  public static int multiply(int a, int b) {
      return a * b;
  }

  public static double divide(int a, int b) {
      return (double) a / b;
  }
}
