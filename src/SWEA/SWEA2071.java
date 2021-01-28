package SWEA;

import java.util.Scanner;

public class SWEA2071 {
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                int num = scan.nextInt();
                sum+=num;
            }
            System.out.println("#"+(i+1)+" "+Math.round(sum/10.0));//자료형주의
        }
    }
}
