package lab2;

public class Lab2_Recursion {
    public static void main(String[] args) {
        int[] numArray = {3, 5, 6, 2, 6, 10, 12, 22, 10, 3};
        System.out.println("Hello World!");

        System.out.println("Calculated using a formula: " + triangularFormula(5)); // * This uses the n(n+1)/2 formula

        System.out.println("Calculated using a loop: " + triangularLoop(5)); // * This uses a for loop to calculate it

        System.out.println("Calculated using recursion: " + triangularRecursion(5)); // * This uses recursion

        System.out.println("Factorial calculated using recursion: " + factorialRecursion(5)); // * This calculates the factorial by using recursion
        
        System.out.println("Exponentiation using recursion: " + exponentRecursion(5, 3)); // * This calculates a base to the power of an exponent by using recursion
    
        System.out.println("Biggest number in array: " + largestNumber(numArray, 9));
    }

    public static int triangularFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int triangularLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {sum += i;}
        return sum;
    }

    public static int triangularRecursion(int n) {
        System.out.println("One loop");
        if (n == 1) {return 1;}
        return n + triangularRecursion(n - 1);
    }

    public static int factorialRecursion(int n) { // * Some extra practice
        if (n == 1) {return 1;}
        return n * factorialRecursion(n - 1);
    }

    public static int exponentRecursion(int base, int power) { // * Some extra practice
        if (power == 0) {return 1;}
        return base * exponentRecursion(base, power - 1);
    }

    //* Recursion Practice 2/4/2025 */
    public static int largestNumber(int[] numbers, int index) {
        if (index == 0) {return numbers[0];}
        return java.lang.Math.max(numbers[index], largestNumber(numbers, index - 1));
    }

    public static int largest(int[] numbers, int index) {
        if (index == 0) {
          return numbers[0];
        }
        return Math.max(numbers[index], largest(numbers, index-1));
      }
    
    public static int multiply(int x, int y) {
        if (x == 1) {
            return y;
        } else {
            return multiply(x - 1, y) + y;
        }
      }    

    public static int GCD(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return GCD(y, x % y);
        }
    }

    public static int countChr(String str) {
        if (str.length() == 0) {
          return 0;
        }
        int count = 0;
        if (str.substring(0, 1).equals("A")) {
          count = 1;
        }
        return count + countChr(str.substring(1, str.length()));
                                }
      
}
