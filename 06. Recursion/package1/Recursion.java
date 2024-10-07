// Factorial.java
// Recursive factorial method
package package1;

public class Recursion {
   // Factorial calculation
   public static int factorial(int n) {
      if (n == 0 || n == 1) {
         return 1;
      }
      return n * factorial(n - 1);
   }

   // Fibonacci sequence
   public static int fibonacci(int n) {
      if (n <= 1) {
         return n;
      }
      return fibonacci(n - 1) + fibonacci(n - 2);
   }

   // Sum of natural numbers
   public static int sumOfNaturalNumbers(int n) {
      if (n == 1) {
         return 1;
      }
      return n + sumOfNaturalNumbers(n - 1);
   }

   // Power calculation
   public static double power(double base, int exponent) {
      if (exponent == 0) {
         return 1;
      }
      return base * power(base, exponent - 1);
   }

   // Binary search
   public static int binarySearch(int[] arr, int left, int right, int target) {
      if (right >= left) {
         int mid = left + (right - left) / 2;

         if (arr[mid] == target) {
            return mid;
         }

         if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
         }

         return binarySearch(arr, mid + 1, right, target);
      }

      return -1;
   }


}

