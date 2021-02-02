package SWEA;

import java.util.Scanner;

public class SWEA1979 {
    static int board[][];
    static int n, k;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            k = sc.nextInt();
            board = new int[n][n];
            //초기화 제발 주의
            int count = 0;
            for (int col = 0; col < n; col++) {
                for (int row = 0; row < n; row++) {
                    board[col][row] = sc.nextInt();
                }
            }
            //가로 체크
            for (int col = 0; col < n; col++) {
                int row = 0;
                int cnt = 0;
                while (true) {
                    if (board[col][row] == 1) {
                        cnt++;
                        row++;
                    } else {
                        if (cnt == k) count++;
                        cnt = 0;
                        row++;
                    }
                    //while break 조건
                    if (row == n) {
                        if (k == cnt) count++;
                        break;
                    }
                }
            }
            //세로 체크
            for (int row = 0; row < n; row++) {
                int cnt = 0;
                int col = 0;
                while (true) {
                    if (board[col][row] == 1) {
                        cnt++;
                        col++;
                    } else {
                        if (k == cnt) count++;
                        cnt = 0;
                        col++;
                    }
                    if (col == n) {
                        if (k == cnt) count++;
                        break;
                    }
                }
            }
            System.out.println("#" + i + " " + count);
        }
    }
}
