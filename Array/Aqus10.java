import java.util.*;

public class Aqus10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        List<Integer> duplicates = findDuplicates(arr);

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate values found.");
        } else {
            System.out.println("Duplicate values: " + duplicates);
        }
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.add(num)) {
                if (!duplicates.contains(num)) {
                    duplicates.add(num);
                }
            }
        }

        return duplicates;
    }
}
