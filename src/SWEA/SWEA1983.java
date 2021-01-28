package SWEA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SWEA1983 {
    static class Score implements Comparable<Score> {
        double score;
        int num;

        public Score(double score, int num) {
            this.score = score;
            this.num = num;
        }

        public int compareTo(Score s) {
            if (this.score > s.score) return -1;
            else return 1;
        }
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet[] = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Score> students = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                double score = sc.nextInt() * 0.35 + sc.nextInt() * 0.45 + sc.nextInt() * 0.2;
                students.add(new Score(score, j));
            }
            Collections.sort(students);
            for (int j = 0; j < n; j++) {
                if(students.get(j).num==k-1){
                    //alphabet index 주의
                    System.out.println("#"+i+" "+alphabet[(int)((double)j/n*10)]);
                }
            }
        }
    }
}
