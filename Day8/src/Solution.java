//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        HashMap <String, Integer> phoneBook = new HashMap<String, Integer>();

        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

            phoneBook.put(name,phone);
        }

        while (in.hasNext()){
            String search = in.next();
            if (phoneBook.get(search) != null) {
                System.out.println(search + "=" + phoneBook.get(search));
            } else System.out.println("Not found");
        }

        in.close();
    }
}
