package solution3;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        String str;
        char ch;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        ch = scan.nextLine().charAt(0);
        System.out.println(str.replace(ch, '*'));

    }

}
