package Recursion;

import java.util.Scanner;

public class Ankit_String_length {

        private static final int length = 1;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String s = scanner.nextLine();
            System.out.println(count(s, 0));
        }

        public static int count(String s, int index) {

            try {
                s.charAt(index);
                return  length  + count(s, index + 1);

            }catch (Exception e) {
                return 0;
            }

        }

}
