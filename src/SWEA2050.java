import java.util.Scanner;

public class SWEA2050 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            //각 알파벳의 아스키코드에서 64를 뺀다.
            int alp = (int) word.charAt(i);
            System.out.print((alp-64)+" ");
        }
    }
}
