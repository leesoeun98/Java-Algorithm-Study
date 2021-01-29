package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon15654 {
    static int num[];
    static int result[];
    static int isVisited[];
    static int m;
    static int n;

    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        num = new int[n];
        result = new int[m];
        isVisited = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        Arrays.fill(isVisited, 0);
        Arrays.sort(num);
        combination(0);
    }

    static void combination(int depth) {
        if (m == depth) {
            //출력
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if(isVisited[i]!=1) result[depth] = num[i];
            else continue;
            isVisited[i]=1;
            combination(depth + 1);
            isVisited[i]=0;
        }
    }
}
