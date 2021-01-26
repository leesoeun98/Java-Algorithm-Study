import java.util.Scanner;

public class SWEA2070 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            if (first < second) {
                System.out.println("<");
            } else if (first == second) {
                System.out.println("=");
            } else {
                System.out.println(">");
            }
        }
    }
}
