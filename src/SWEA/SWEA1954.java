package SWEA;

import java.util.Scanner;

public class SWEA1954 {
    static int snail[][];

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            int n = sc.nextInt();
            snail = new int[n][n];
            drawSnail(0, n, 0, 1);
            System.out.println("#"+i+" ");
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(snail[j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    static void drawSnail(int depth, int n, int start, int num) {
        if (n % 2 == 1 && depth == n / 2 + 1) return;
        else if (n % 2 == 0 && depth == n / 2) return;
        //윗줄
        for (int j = start; j < n - start; j++) snail[depth][j] = num++;
        //오른쪽 줄
        for (int j = start + 1; j < n - start; j++) snail[j][n - 1 - depth] = num++;
        //아래줄
        for (int j = n - 2 - start; j >= start; j--) snail[n - 1 - depth][j] = num++;
        //왼쪽 줄
        for (int j = n - 2 - start; j > start; j--) snail[j][depth] = num++;

        drawSnail(depth + 1, n, start + 1, num);
    }
}
