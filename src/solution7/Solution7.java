package solution7;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        String str;
        int weight = 0;
        int ascii;
        char ch;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            ascii = ch;
            weight = weight + ascii;
        }

    }
}
