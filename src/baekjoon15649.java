import java.util.Scanner;

public class baekjoon15649 {
    static int num[];
    static int isVisted[];
    static int m;
    static int n;

    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        num = new int[m];
        isVisted = new int[n];
        for (int i = 0; i < n; i++) {
            isVisted[i] = 0;
        }
        permutation(0);
    }

    static void permutation(int depth) {
        if (m == depth) {
            //출력
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            //각 depth에 해당하는 숫자 넣기, (방문 안한 숫자면)
            if (isVisted[i] != 1) num[depth] = i+1;
            //방문한 숫자면 재귀호출 아예 안되게 continue
            else continue;
            //방문한 숫자로 바꾸기
            isVisted[i] = 1;
            //재귀
            permutation(depth + 1);
            isVisted[i] = 0;
        }
    }

}
