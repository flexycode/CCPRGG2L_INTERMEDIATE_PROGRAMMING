package Intermediate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {
    public static void main(String[] args) {
    	// Try statement
        try 
        (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter an email address: ");
			String email = scanner.nextLine();
			System.out.print("Enter a mobile number: ");
			String mobileNumber = scanner.nextLine();

			// Regular expression patterns
			String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
			String mobileNumberPattern = "^\\+\\d{1,3}-\\d{3}-\\d{3}-\\d{4}$";

			// Validate email address
			Pattern emailRegex = Pattern.compile(emailPattern);
			Matcher emailMatcher = emailRegex.matcher(email);
			if (emailMatcher.matches()) {
			    System.out.println("VALID EMAIL ADDRESS");
			} else {
			    System.out.println("Invalid EMAIL");
			}

			// Validate mobile number
			Pattern mobileNumberRegex = Pattern.compile(mobileNumberPattern);
			Matcher mobileNumberMatcher = mobileNumberRegex.matcher(mobileNumber);
			if (mobileNumberMatcher.matches()) {
			    System.out.println("VALID CONTACT NUMBER");
			} else {
			    System.out.println("Invalid MOBILE");
			}
		}
    }
}