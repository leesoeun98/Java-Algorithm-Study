import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon14502 {
    static int n;
    static int m;
    static int center[][];
    static ArrayList<Integer> safezone;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        safezone = new ArrayList<Integer>();
        center = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                center[i][j] = scan.nextInt();
            }
        }
        //wall 호출
        //max 출력

    }

    static void wall(int wall_count) {
        if (wall_count == 3) {
            //바이러스 퍼뜨리기
            //안전 영역 크기 구해서 저장
            //safezone.add();
            return;
        }
        //n*m에서 반복 {
        //0이 있으면 1로 바꾸기
        //다음 wall 함수 호출
        //바꾼 1을 다시 0으로 복원 }

    }

}
