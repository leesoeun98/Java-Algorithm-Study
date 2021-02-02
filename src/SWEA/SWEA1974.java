package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA1974 {
    static int sudoku[][];

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sudoku = new int[9][9];
            for (int j = 0; j < 9; j++) {
                for (int h = 0; h < 9; h++) {
                    sudoku[j][h] = sc.nextInt();
                }
            }
            if(checkRow()&&checkCol()&&checkBlock()){
                System.out.println("#"+i+" "+1);
            }else{
                System.out.println("#"+i+" "+0);
            }
        }
    }

    static boolean checkRow() {
        for (int col = 0; col < 9; col++) {
            int check[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int row = 0; row < 9; row++) {
                check[sudoku[col][row] - 1] += 1;
                if (check[sudoku[col][row] - 1] > 1) return false;
            }
        }
        return true;
    }

    static boolean checkCol() {
        for (int row = 0; row < 9; row++) {
            int check[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int col = 0; col < 9; col++) {
                check[sudoku[col][row] - 1] += 1;
                if (check[sudoku[col][row] - 1] > 1) return false;
            }
        }
        return true;
    }

    static boolean checkBlock() {
        for (int col = 0; col < 9; col += 3) {
            for (int row = 0; row < 9; row += 3) {
                int check[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
                for (int i = col; i < col + 3; i++) {
                    for (int j = row; j < row + 3; j++) {
                        check[sudoku[i][j] - 1] += 1;
                        if (check[sudoku[i][j] - 1] > 1) return false;
                    }
                }
            }
        }
        return true;
    }
}
