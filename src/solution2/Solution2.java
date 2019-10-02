package solution2;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        String str;
        int index;
        Scanner scan = new Scanner(System.in);
        index = scan.nextInt();
        scan.nextLine();
        str = scan.nextLine();
        if (index <= (str.length()))
            System.out.println(str.substring(index));
        else
            System.out.println("IndexOutOfBound");
    }

}
