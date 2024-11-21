package Intermediate;

public class SBDelete {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is a deleted text");

        // Remove "deleted" (starting at index 9, length 8)
        sb.delete(9, 17);

        System.out.println(sb.toString()); // Output: This is a test
    }
    
}
