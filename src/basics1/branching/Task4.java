package basics1.branching;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input sides of whole A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("input sides of brick x,y,z");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (((x<a)&(y<b))|((x<a)&(z<b))|((y<a)&(z<b))|((x<b)&(y<a))|((z<a)&(y<b))|((x<b)&(z<a))) {
            System.out.println("OK");
        }else {
            System.out.println("No");
        }

        sc.close();
    }
}
