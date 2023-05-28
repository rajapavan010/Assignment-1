public class Lqus6 {
  public static void main(String[] args) {
      int number = 10;
      
      System.out.println("Even numbers between 10 and 100:");
      
      while (number <= 100) {
          if (number % 2 == 0) {
              System.out.println(number);
          }
          
          number++;
      }
  }
}
