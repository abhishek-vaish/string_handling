package solution9;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Solution9 {
    public static void main(String[] args) {
        String str;
        char ch;
        int upperCase = 0;
        int lowerCase = 0;
        int ascii = 0;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (isUpperCase(ch)) {
                ascii = ch;
                upperCase = upperCase + ascii;
            } else {
                ascii = ch;
                lowerCase = lowerCase + ascii;

            }
        }

    }
}
