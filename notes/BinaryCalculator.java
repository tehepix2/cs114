import java.util.Scanner;

public class BinaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println();
        
        String bNumber = "";

        while (number != 0) {
            
            int remainder = number % 2;
            number /= 2;
            bNumber = remainder + bNumber;

        }
        System.out.println(bNumber);

        input.close();
    }
}