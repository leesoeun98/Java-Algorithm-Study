package BOJ;

import java.util.Scanner;

public class baekjoon1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            b = b % 4 + 4; //모든 숫자는 4주기 
            double answer = a;
            for (int count = 2; count <= b; count++) {
                answer = (answer * a) % 10;
            }
            System.out.println(answer == 0 ? 10 : (int) answer);
        }
    }
}
