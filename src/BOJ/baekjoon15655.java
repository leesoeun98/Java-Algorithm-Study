package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon15655 {
    static int num[];
    static int result[];
    static int m;
    static int n;

    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        num = new int[n];
        result = new int[m];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        combination(0, 0);
    }

    static void combination(int depth, int start) {
        if (m == depth) {
            //출력
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < n; i++) {
            result[depth] = num[i];
            combination(depth + 1, i+1);
        }
    }
}
