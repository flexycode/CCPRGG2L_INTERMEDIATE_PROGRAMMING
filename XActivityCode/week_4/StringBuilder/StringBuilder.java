import java.util.Scanner;

public class StringBuilderOperations {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a StringBuilder object from the input string  
        StringBuilder sb = new StringBuilder(input);

        // Flag to control the loop
        boolean continueOperations = true;

        while (continueOperations) {
            // Display the menu of operations
            System.out.println("\nChoose an operation:");
            System.out.println("1. Append");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Replace");
            System.out.println("5. Reverse");
            System.out.println("6. Exit");

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Append operation
                    System.out.print("Enter a string to append: ");
                    String appendStr = scanner.nextLine();
                    sb.append(appendStr);
                    System.out.println("Result: " + sb);
                    break;
                case 2:
                    // Insert operation
                    System.out.print("Enter a string to insert: ");
                    String insertStr = scanner.nextLine();
                    System.out.print("Enter the index to insert at: ");
                    int index = scanner.nextInt();
                    sb.insert(index, insertStr);
                    System.out.println("Result: " + sb);
                    break;
                case 3:
                    // Delete operation
                    System.out.print("Enter the starting index to delete: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter the length to delete: ");
                    int length = scanner.nextInt();
                    sb.delete(startIndex, startIndex + length);
                    System.out.println("Result: " + sb);
                    break;
                case 4:
                    // Replace operation
                    System.out.print("Enter the starting index to replace: ");
                    int replaceStartIndex = scanner.nextInt();
                    System.out.print("Enter the length to replace: ");
                    int replaceLength = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the replacement string: ");
                    String replaceStr = scanner.nextLine();
                    sb.replace(replaceStartIndex, replaceStartIndex + replaceLength, replaceStr);
                    System.out.println("Result: " + sb);
                    break;
                case 5:
                    // Reverse operation
                    sb.reverse();
                    System.out.println("Result: " + sb);
                    break;
                case 6:
                    // Exit the program
                    continueOperations = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the Scanner object
        scanner.close();
    }
}
