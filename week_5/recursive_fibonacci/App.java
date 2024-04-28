public class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int number = 6;
        int result = fibonacci(number);
        System.out.println("The Fibonacci number at position " + number + " is: " + result);
    }
}
