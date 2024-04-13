package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        // Create a file containing the usernames and passwords
        String[] fileContents = {"Juan Limbo34", "Alan 12Laure", "Kenzo Virus26", "Gabriel Macato36", "Joshua 78Manalansan"};
        createFile(fileContents);

        // Read the file and validate the username and password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean validCredentials = validateCredentials(username, password);
        if (validCredentials) {
            System.out.println("Successfully entered the program!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }

    private static void createFile(String[] fileContents) {
        try {
            // Set the file path to your Documents folder
            String filePath = "C:\\Users\\flexycode\\eclipse-workspace\\File-Handling";
            for (int i = 0; i < fileContents.length; i++) {
                FileWriter textOut = new FileWriter(filePath + "namepass_" + i + ".txt");
                textOut.write(fileContents[i]);
                textOut.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    private static boolean validateCredentials(String username, String password) {
        for (int i = 0; i < 5; i++) {
            try {
                File file = new File("namepass_" + i + ".txt");
                Scanner fileScanner = new Scanner(file);
                String line = fileScanner.nextLine();
                String[] credentials = line.split(" ");
                if (credentials.length == 2 && credentials[0].equals(username) && credentials[1].equals(password)) {
                    fileScanner.close();
                    return true;
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
        }
        return false;
    }
}