package package1;

public class Main {

    public static void main(String[] args) {
        // Test factorial
        System.out.println("Factorial of 5: " + Recursion.factorial(5));
        System.out.println("__________________");
        // Test Fibonacci
        System.out.println("10th Fibonacci number: " + Recursion.fibonacci(10));
        System.out.println("__________________");
        // Test sum of natural numbers
        System.out.println("Sum of first 10 natural numbers: " + Recursion.sumOfNaturalNumbers(10));
        System.out.println("__________________");
        // Test power
        System.out.println("2^5: " + Recursion.power(2, 5));
        System.out.println("__________________");
        // Test binary search
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = Recursion.binarySearch(arr, 0, arr.length - 1, target);
        System.out.println("Index of " + target + " in array: " + result);
    }
}
