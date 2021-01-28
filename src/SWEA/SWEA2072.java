package SWEA;

import java.util.Scanner;

public class SWEA2072 {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                int num = scan.nextInt();
                if (num % 2 == 1) {
                    sum += num;
                }
            }
            System.out.println("#"+(i+1)+" "+sum);
        }
    }
}
