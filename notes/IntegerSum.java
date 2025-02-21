
public class IntegerSum {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        allSums(1000);
    }

    public static void allSums(int n) { //* Input: Positive number n; Output: All non-negative integers */
        
        for (int num1 = 0; num1 <= n; ++num1) {
            for (int num2 = 0; num2 <= n; ++num2) {
                int num3 = n - (num1 + num2);
                if (num3 >= 0) {
                    System.out.print("(" + num1 + ", " + num2 + ", " + num3 + ")\n");
                }
                
            }
        }
    }
}
