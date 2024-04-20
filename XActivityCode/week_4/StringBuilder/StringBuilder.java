package StringBuilder;

import java.util.Scanner;

public class StringManipulator {
    private static StringBuilder sb;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        sb = new StringBuilder(input);

        boolean continueOperations = true;

        while (continueOperations) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    appendString();
                    break;
                case 2:
                    insertString();
                    break;
                case 3:
                    deleteString();
                    break;
                case 4:
                    replaceString();
                    break;
                case 5:
                    reverseString();
                    break;
                case 6:
                    continueOperations = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void displayMenu() {    	
    	// This method display the menu of the operations to the user ^_^
        System.out.println("\nChoose an operation:");
        System.out.println("1. Append");
        System.out.println("2. Insert");
        System.out.println("3. Delete");
        System.out.println("4. Replace");
        System.out.println("5. Reverse");
        System.out.println("6. Exit");
    }

    private static void appendString() {
    	// This method appends a string to the end to the end of the existing string ^_^
        System.out.print("Enter a string to append: ");
        String appendStr = scanner.nextLine();
        sb.append(appendStr);
        System.out.println("Result: " + sb);
    }

    private static void insertString() {
    	// This method insert a portion of the existing string ^_^
        System.out.print("Enter a string to insert: ");
        String insertStr = scanner.nextLine();
        System.out.print("Enter the index to insert at: ");
        int index = scanner.nextInt();
        sb.insert(index, insertStr);
        System.out.println("Result: " + sb);
    }

    private static void deleteString() {
    	// This method delete a portion of the existing string ^_^
        System.out.print("Enter the starting index to delete: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the length to delete: ");
        int length = scanner.nextInt();
        sb.delete(startIndex, startIndex + length);
        System.out.println("Result: " + sb);
    }

    private static void replaceString() {
    	// This method replace a portion of the existing string ^_^
        System.out.print("Enter the starting index to replace: ");
        int replaceStartIndex = scanner.nextInt();
        System.out.print("Enter the length to replace: ");
        int replaceLength = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter the replacement string: ");
        String replaceStr = scanner.nextLine();
        sb.replace(replaceStartIndex, replaceStartIndex + replaceLength, replaceStr);
        System.out.println("Result: " + sb);
    }

    private static void reverseString() {
    	// This method reverse a portion of the existing string ^_^
        sb.reverse();
        System.out.println("Result: " + sb);
    }
}
