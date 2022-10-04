package basics1.linear;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input nat number (time in seconds)");
        int time = sc.nextInt();

        int hours = time/3600;
        int remSec = time -hours*3600;
        int minutes = remSec/60;
        int seconds = remSec%60;
        System.out.printf("%dч %dмин %dсек",hours,minutes,seconds);
    }
}
