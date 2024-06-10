package ArrayExceptionHandling;

import java.util.Scanner;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Three"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array values: " + String.join(", ", array));

        while (true) {
            try {
                System.out.print("Enter Array Index: ");
                int index = scanner.nextInt();

                if (index >= 0 && index < array.length) {
                    System.out.println("Array Element = " + array[index]);
                    System.out.println("Exception: Caught");
                } else {
                    throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println("Quitting...");
                break;
            } catch (Exception e) {
                System.out.println("Exception: Caught");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        scanner.close();
    }
}