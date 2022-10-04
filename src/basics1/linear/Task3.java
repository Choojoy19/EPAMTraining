package basics1.linear;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input x,y");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double result = ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x-y);
        System.out.println("result = "+result);
        sc.close();

    }
}
