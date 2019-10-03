package solution8;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Solution8 {
    public static void main(String[] args) {
        String str;
        char ch;
        int weight = 0;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (isUpperCase(ch)) {
                int ascii = ch;
                weight = weight + ascii;
            }
        }
        System.out.println("UpperWeight : " + weight);
    }
}
