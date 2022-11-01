package basics1.cycles;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("input range [A;B]");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=a; i<=b; i++){
            System.out.println(i + " " + (char) i);
        }
    }
}
