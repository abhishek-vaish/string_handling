package solution1;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        int number;
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number string you want to input :");
        number = scan.nextInt();
        scan.nextLine();
        String arr[] = new String[number];
        for (int i = 0; i < number; i++) {
            arr[i] = scan.nextLine().trim();
        }


    }

}
