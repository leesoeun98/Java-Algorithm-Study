import java.util.Scanner;

public class SWEA1989 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            String word = sc.next();
            boolean flag = true;
            for (int j = 0; j < word.length() / 2; j++) {
                if (word.charAt(j) == word.charAt(word.length() - j - 1)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("#"+i+" "+1);
            else System.out.println("#"+i+" "+0);
        }
    }
}
