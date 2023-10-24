import java.util.Scanner;

class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for array length
        System.out.print("Enter length of the array: ");
        int length = scanner.nextInt();

        // Read array elements
        int[] array = new int[length];
        System.out.println("Enter " + length + " sorted array elements:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        // Prompt for target element
        System.out.print("Enter target: ");
        int target = scanner.nextInt();

        // Implementing Binary Search
        int start = 0;
        int end = length - 1;

        boolean isFound = false;

        while (start <= end) {
            int mid = start + (end - start) / 2;  // To avoid possible integer overflow

            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                System.out.println("Target found at index: " + mid);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Target not found in the array.");
        }
    }
}
