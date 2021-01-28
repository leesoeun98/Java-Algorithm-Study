package SWEA;

import java.util.Scanner;

public class SWEA1986 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 1; j <= T; j++) {
            int sum = 0;
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) sum -= i;
                else sum += i;
            }
            System.out.println("#"+j+" "+sum);
        }
    }
}
