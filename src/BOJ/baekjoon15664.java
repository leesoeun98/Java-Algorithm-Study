package BOJ;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class baekjoon15664 {

    static int result[];
    static ArrayList<Integer> numarray;

    static int n;
    static int m;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        numarray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numarray.add(num);
        }
        result = new int[m];
        Collections.sort(numarray);
        printcombi(0, 0);
    }

    static void printcombi(int depth, int start) {
        int num = 0;
        if (depth == m) {
            for (int r : result) {
                System.out.print(r + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < numarray.size(); i++) {
            if (num == numarray.get(i)) continue;
            result[depth] = numarray.get(i);
            printcombi(depth + 1, i + 1);
            num = numarray.get(i);
        }
    }
}
