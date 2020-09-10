package Array;

import java.util.HashMap;
import java.util.Scanner;

public class string_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        HashMap<String, Integer> storemap = new HashMap<>();
        for(int index = 0;index<size;index++){
            String str = scanner.next();
            if(!storemap.containsKey(str)){
                storemap.put(str, 0);
                System.out.println("OK");
            }
            else{
                storemap.put(str, storemap.get(str)+1);
                System.out.println(str+storemap.get(str));
            }
        }
    }

}
