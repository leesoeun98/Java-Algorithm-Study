import java.util.*;

//https://geehye.github.io/baekjoon-1107/# 참고 
public class baekjoon1107 {
    static int[] button = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    static int n;

    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int m = scan.nextInt();
        int min = Math.abs(n - 100); // 100에서 n까지 -, +로만 이동하는데 걸린 횟수
        for (int i = 0; i < m; i++) {
            button[scan.nextInt()] = 0;
        }
        //1부터 1000000만까지 채널 i 에서
        //i 채널 만들 수 있는지 isPossible 함수로 확인 => 각 자릿수로 쪼갰을 때, button[해당 자릿수 숫자]==0인지 확인 => 모두 1이면 가능
        //i채널 만들 수 있다면, i 채널을 만드는데 걸린 count
        //i채널에서 n까지 +, -버튼으로 이동하는데 걸리는 count + i채널 만드는데 걸린 count vs min
        //갱신한 min 출력
        for (int i = 0; i <= 1000000; i++) {
            int count = isPossible(i); // 가능하지 않으면 0
            if (count > 0) {
                min = Math.min(min, count + Math.abs(n - i));
            }
        }
        System.out.println(min);
    }

    static int isPossible(int i) {
        int count = 0;
        if (i == 0) {
            return button[i] == 1 ? 1 : 0;
        }
        while (i > 0) {
            if (button[i % 10] == 0) { //불가능한거니까 바로 0
                return 0;
            }
            count++;
            i /= 10;
        }
        return count;
    }

}
