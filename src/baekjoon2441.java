import java.util.Scanner;

public class baekjoon2441 {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int k = n; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
