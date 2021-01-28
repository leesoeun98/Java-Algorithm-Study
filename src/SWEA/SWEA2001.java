package SWEA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SWEA2001 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int board[][] = new int[n][n];
            ArrayList<Integer> flycount = new ArrayList<>();
            for (int l = 0; l < n; l++) {
                for (int h = 0; h < n; h++) {
                    board[l][h] = sc.nextInt();
                }
            }
            int fly_sum;
            //1. 그래프 모두 탐색해서 fly의 sum을 구해서 arraylist에 추가
            for (int col = 0; col < n - m + 1; col++) {
                for (int row = 0; row < n - m + 1; row++) {
                    fly_sum = 0;
                    for (int smallcol = col; smallcol < col + m; smallcol++) {
                        for (int smallrow = row; smallrow < row + m; smallrow++) {
                            fly_sum += board[smallcol][smallrow];
                        }
                    }
                    flycount.add(fly_sum);
                    System.out.println(fly_sum);
                }
            }
            System.out.println("#" + i + " " + Collections.max(flycount));
        }
    }
}
