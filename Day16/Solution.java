import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int test = Integer.parseInt(S);
            System.out.println(test);
        } catch (Exception e){
            System.out.println("Bad String");
        }
    }
}
