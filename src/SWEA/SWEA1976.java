package SWEA;

import java.util.Scanner;

public class SWEA1976 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int firsthour = sc.nextInt();
            int firstminute = sc.nextInt();
            int secondhour = sc.nextInt();
            int secondminute = sc.nextInt();
            int hour = 0;
            int minute = 0;
            if (firstminute + secondminute >= 60) {
                hour = firsthour + secondhour + 1;
                minute = (firstminute + secondminute) % 60;
                if (hour > 12) hour = hour % 12;
                if (hour == 0) hour = 12;
            } else {
                hour = firsthour + secondhour;
                minute = (firstminute + secondminute) % 60;
                if (hour > 12) hour = hour % 12;
                if (hour == 0) hour = 12;
            }
            System.out.println("#" + i + " " + hour + " " + minute);
        }
    }
}
