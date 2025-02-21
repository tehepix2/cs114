package sorting;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[] intArr = new int[] {0,4,3,2,5}; // * Array of integers
        String[] strArr = new String[] {"abb", "az", "bcc", "", "w", "ca", "cca"}; // * Array of string

        basicIntSorting.bubbleSort(intArr); // * Bubble sorts the array of integers
        System.out.println(Arrays.toString(intArr)); // * Prints the sorted array

        BasicSorting.bubbleSort(strArr); // * Sorts the array of strings
        System.out.println(Arrays.toString(strArr)); // * Prints the sorted array
    }
}
