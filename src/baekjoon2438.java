import java.util.Scanner;

public class baekjoon2438 {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
