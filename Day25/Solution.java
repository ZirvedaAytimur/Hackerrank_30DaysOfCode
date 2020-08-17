import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        test :
        for (int a0 = 0; a0 < test; a0++) {
            long n = scanner.nextLong();
            if (n == 1) {
                System.out.println("Not prime");
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        System.out.println("Not prime");
                        continue test;
                    }
                }

                System.out.println("Prime");
            }
        }
    }
}