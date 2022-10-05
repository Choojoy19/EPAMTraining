package basics1.branching;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input angles a,b,c,d");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();


        int x;
        int y;

        if (a<b){
             x = a;
        } else {
             x =b;
        }

        if (c<d){
             y = c;
        } else {
             y =d;
        }

        if (x>y) {
            System.out.println("answer - "+x);
        }else {
            System.out.println("answer - "+y);
        }
     sc.close();
    }
}
