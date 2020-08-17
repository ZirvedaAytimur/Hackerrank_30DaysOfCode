import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

         int actRetDay = scanner.nextInt();
         int actRetMonth = scanner.nextInt();
         int actRetYear = scanner.nextInt();

         int expRetDay = scanner.nextInt();
         int expRetMonth = scanner.nextInt();
         int expRetYear = scanner.nextInt();

         int fine = 0;

         if (expRetYear < actRetYear) {
             fine = 10000;
         } else if (expRetYear == actRetYear) {
             if (actRetMonth > expRetMonth) {
                 fine = (actRetMonth - expRetMonth) * 500;
             } else if (actRetMonth == expRetMonth && actRetDay > expRetDay) {
                 fine = (actRetDay - expRetDay) * 15;
             }
         }

         System.out.println(fine);
    }
}