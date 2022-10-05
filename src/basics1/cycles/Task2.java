package basics1.cycles;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the begin (a) and the end (b)");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("input step (h)");
        int h = sc.nextInt();

        int y;

        for (int i = a; i<=b; i+=h){
            if (i>2){
                y=i;
            } else {
                y= (-1)*i;
            }
            System.out.println("y = "+y);
        }
        sc.close();
    }
}
