package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA1970 {
    static int coin[] = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10};

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int money = sc.nextInt();
            money = Math.round((money / 10) * 10);
            int dp[] = new int[8];

            for (int k = 0; k < 8; k++) {
                if(coin[k]>money){
                    dp[k]=0;
                    continue;
                }
                int n = money/coin[k];
                for ( int j = 1; j <= n; j++) {
                    money-=coin[k];
                    dp[k]++;
                }
            }
            System.out.println("#"+i+" ");
            for(int d:dp){
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}
