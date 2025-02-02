public class PrintArray {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Printing the array using a for-each loop
        System.out.println("Array elements are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // To print a new line after array elements
    }
}