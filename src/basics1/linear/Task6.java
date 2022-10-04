package basics1.linear;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input x,y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        boolean z = (((x >= -2 & x <= 2) & (y >= -3 & y <= 4)) | ((x >= -4 & x <= 4) & (y >= -3 & y <= 0))) & ((x != -1) & (y != -1));

        System.out.println(z);
    }
}
