package BOJ;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon15651 {
    static int m, n;
    static int nums[];
    static BufferedWriter bw;
    static public void main(String[] args) throws IOException {
        //출력시 시간 초과 나서 바꾸기 
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        nums = new int[m];
        Arrays.fill(nums, 0);
        permutation(0);
        bw.flush();
    }

    static public void permutation(int depth) throws IOException {
        if (depth == m) {
            for (int i : nums) {
                bw.write(i + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = 0; i < n; i++) {
            nums[depth] = i + 1;
            permutation(depth + 1);
        }
    }
}
