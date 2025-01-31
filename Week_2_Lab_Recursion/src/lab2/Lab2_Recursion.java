package lab2;

public class Lab2_Recursion {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Calculated using a formula: " + triangularFormula(5)); // * This uses the n(n+1)/2 formula

        System.out.println("Calculated using a loop: " + triangularLoop(5)); // * This uses a for loop to calculate it

        System.out.println("Calculated using recursion: " + triangularRecursion(5)); // * This uses recursion

        System.out.println("Factorial calculated using recursion: " + factorialRecursion(5)); // * This calculates the factorial by using recursion
        
        System.out.println("Exponentiation using recursion: " + exponentRecursion(5, 3)); // * This calculates a base to the power of an exponent by using recursion
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
}
