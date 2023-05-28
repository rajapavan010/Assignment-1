public class Aqus17 {
  public static void main(String[] args) {
      int[] array = {5, 12, 8, 23, 17, 9};
      boolean containsSpecifiedElements = verifyArray(array, 12, 23);
      System.out.println("Array contains 12 and 23: " + containsSpecifiedElements);
  }

  public static boolean verifyArray(int[] array, int element1, int element2) {
      boolean containsElement1 = false;
      boolean containsElement2 = false;

      for (int i = 0; i < array.length; i++) {
          if (array[i] == element1) {
              containsElement1 = true;
          }

          if (array[i] == element2) {
              containsElement2 = true;
          }
      }

      return containsElement1 && containsElement2;
  }
}
