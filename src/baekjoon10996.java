import java.util.Scanner;

public class baekjoon10996 {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 0) {
                for (int j=0;j<n/2;j++) {
                    System.out.print(" ");
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j=0;j<n-n/2;j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
