package sorting;
import java.util.Arrays;

import comperables.CrazyInteger;
import comperables.CrazyString;
public class Tester {
    public static void main(String[] args) {
        int[] intArr = new int[] {0,4,3,2,5}; // * Array of integers
        String[] strArr = new String[] {"abb", "az", "bcc", "", "w", "ca", "cca"}; // * Array of string

        basicIntSorting.bubbleSort(intArr); // * Bubble sorts the array of integers
        System.out.println(Arrays.toString(intArr)); // * Prints the sorted array

        BasicSorting.bubbleSort(strArr); // * Sorts the array of strings
        System.out.println(Arrays.toString(strArr)); // * Prints the sorted array

        CrazyString[] arr1 = new CrazyString[] {
            new CrazyString("abb"),
            new CrazyString("az"),
            new CrazyString("bcc"),
            new CrazyString(""),
            new CrazyString("w"),
            new CrazyString("ca"),
            new CrazyString("cca")
        };

        BasicSorting.SelectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        
        CrazyInteger[] arr2 = new CrazyInteger[] {
            new CrazyInteger(24),
            new CrazyInteger(15),
            new CrazyInteger(28),
            new CrazyInteger(24),
            new CrazyInteger(13),
            new CrazyInteger(78),
            new CrazyInteger(214),
            new CrazyInteger(980),
            new CrazyInteger(56)
        };

        BasicSorting.insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));

       
       
    }
}
