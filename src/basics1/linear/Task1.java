package basics1.linear;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double z = ((a-3)*b/2)+c;
        System.out.println("result "+z);
        sc.close();
    }

}