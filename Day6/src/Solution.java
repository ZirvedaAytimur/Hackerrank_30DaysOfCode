import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);

        int T=scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<T;i++){
            String s=scanner.nextLine();
             for (int j=0;j<s.length();j++){
                 if (j%2==0) {
                     System.out.print(s.charAt(j));
                 }
             }
             System.out.print(" ");
            for (int j=0;j<s.length();j++){
                if (j%2!=0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}