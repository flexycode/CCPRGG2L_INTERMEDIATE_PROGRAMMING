import java.util.Scanner;

class StringOperations {
    private StringBuilder sb;
    private Scanner scanner;

    public StringOperations() {
        scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        sb = new StringBuilder(input);
    }

    public void performOperations() {
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

    private void displayMenu() {
        System.out.println("\nChoose an operation:");
        System.out.println("1. Append");
        System.out.println("2. Insert");
        System.out.println("3. Delete");
        System.out.println("4. Replace");
        System.out.println("5. Reverse");
        System.out.println("6. Exit");
    }

    private void appendString() {
        System.out.print("Enter a string to append: ");
        String appendStr = scanner.nextLine();
        sb.append(appendStr);
        System.out.println("Result: " + sb);
    }

    private void insertString() {
        System.out.print("Enter a string to insert: ");
        String insertStr = scanner.nextLine();
        System.out.print("Enter the index to insert at: ");
        int index = scanner.nextInt();
        sb.insert(index, insertStr);
        System.out.println("Result: " + sb);
    }

    private void deleteString() {
        System.out.print("Enter the starting index to delete: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the length to delete: ");
        int length = scanner.nextInt();
        sb.delete(startIndex, startIndex + length);
        System.out.println("Result: " + sb);
    }

    private void replaceString() {
        System.out.print("Enter the starting index to replace: ");
        int replaceStartIndex = scanner.nextInt();
        System.out.print("Enter the length to replace: ");
        int replaceLength = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the replacement string: ");
        String replaceStr = scanner.nextLine();
        sb.replace(replaceStartIndex, replaceStartIndex + replaceLength, replaceStr);
        System.out.println("Result: " + sb);
    }

    private void reverseString() {
        sb.reverse();
        System.out.println("Result: " + sb);
    }
}

public class Main {
    public static void main(String[] args) {
        StringOperations stringOperations = new StringOperations();
        stringOperations.performOperations();
    }
}
