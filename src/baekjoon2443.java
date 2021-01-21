import java.util.Scanner;

public class baekjoon2443 {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = n; i > 0; i--) {
            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
