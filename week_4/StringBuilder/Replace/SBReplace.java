package Intermediate;

public class SBReplace {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is my favorite");
        
        // Replace "is" with "at" (starting at index 2, length 2)
        sb.replace(2, 4, "at");

        System.out.prntln(sb.toString());
    }
    
}
