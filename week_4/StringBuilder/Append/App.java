package Intermediate;

public class StringBuilderAppend {

    public static void main(String[] args) {
        // Create a StringBuilder with some text
        StringBuilder myStr = new StringBuilder("My Email Address is ");

        // Append different data types using append()
        myStr.append("MagicMan ");
        myStr.append(2024);
        myStr.append("@");
        myStr.append("Google.com");

        // Print the StringBuilder
        System.out.println(myStr.toString());

    }
    
}
