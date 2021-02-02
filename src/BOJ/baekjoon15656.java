package BOJ;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class baekjoon15656 {
    static int[] nums;
    static int[] result;
    static int r;
    static BufferedWriter bufferedWriter;

    static public void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        r = sc.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        result = new int[r];
        Arrays.fill(result, 0);
        combination(0);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    static void combination(int depth) throws IOException {
        if (depth == r) {
            for (int rs : result) {
                bufferedWriter.write(rs + " ");
            }
            bufferedWriter.write("\n");
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            result[depth] = nums[i];
            combination(depth + 1);
        }
    }
}
