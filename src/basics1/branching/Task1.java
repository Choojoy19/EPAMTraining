package basics1.branching;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input angles a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a+b)<180) {
            if ((a == 90) | (b == 90)) {
                System.out.println("right triangle");
            } else {
                System.out.println("triangle is exist");
            }
        } else {
            System.out.println("triangle is not exist");
        }
        sc.close();
    }
}
