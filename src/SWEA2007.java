import java.util.Scanner;

public class SWEA2007 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String word = sc.next();

            for (int j = 1; j <= 10; j++) {
                //문자열이면 substring 쓰기
                if (word.substring(0, j).equals(word.substring(j, 2 * j))) {
                    System.out.println("#" + i + " " + j);
                    break;
                }
            }
        }
    }
}
