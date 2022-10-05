package basics1.branching;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input A(x1,y1)");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("input B(x2,y2)");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("input C(x3,y3)");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}
