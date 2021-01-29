package BOJ;

import java.util.Scanner;

public class baekjoon15652 {
    static int num[];
    static int isVisted[];
    static int m;
    static int n;

    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        num = new int[m];
        isVisted = new int[n];
        for (int i = 0; i < n; i++) {
            isVisted[i] = 0;
        }
        combination(0, 0);
    }

    static void combination(int depth, int start) {
        if (m == depth) {
            //출력
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < n; i++) {
            num[depth] = i + 1;
            combination(depth + 1, i);
        }
    }
}
