import java.util.*;

public class Solution {

    // Complete the factorial function below.
    static int factorial(int n, int fact) {

        if (n <= 1){
            return fact;
        } else {
            fact *= n;
            return factorial(n-1, fact);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n, 1);

        System.out.println(result);

        scanner.close();
    }
}
