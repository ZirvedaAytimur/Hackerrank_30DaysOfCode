import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int split, remainder, count = 0, max = Integer.MIN_VALUE;

        while (n / 2 > 0){
            split = n / 2;
            remainder = n - (split * 2);

            if (remainder == 1){
                count++;
                if (max < count){
                    max = count;
                }
            } else count = 0;

            n = split;
        }

        if (n > 0){
            count++;
            if (max < count){
                max = count;
            }
        }

        System.out.println(max);

        scanner.close();
    }
}
