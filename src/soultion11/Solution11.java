package soultion11;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        String str;
        char ch;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        ch = scan.nextLine().charAt(0);
        for (int i = 0; i < (str.length()); i++) {
            if (ch == str.charAt(i)) {
                System.out.println(i);
            }
        }

    }
}
