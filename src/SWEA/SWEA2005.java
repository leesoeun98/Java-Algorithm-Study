package SWEA;

import java.util.Scanner;

public class SWEA2005 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            int triangle[][] = new int[n][n];
            //1. 0으로 초기화
            //2. 1넣기
            // 3.이전 꺼 더해서 나머지 배열 채우기
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    triangle[j][k]=0;
                    if(k==j || k==0) triangle[j][k]=1;
                    else if(j>1 && k>0){
                        triangle[j][k]=triangle[j-1][k-1]+triangle[j-1][k];
                    }
                }
            }
            //4. 출력
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(triangle[j][k]!=0) System.out.print(triangle[j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
