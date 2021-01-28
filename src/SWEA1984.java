import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SWEA1984 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int arr[] = new int[10];
            int sum =0;
            int min =99999;
            int max =0;
            for(int j=0;j<10;j++){
                arr[j]=sc.nextInt();
                max = Math.max(arr[j], max);
                min = Math.min(arr[j], min);
            }
            for(int j=0;j<10;j++){
                if(arr[j]==max || arr[j]==min){
                    continue;
                }
                sum+=arr[j];
            }
            //sum은 float여야 함. 그래야 int / int 결과로 다르게 나오는거 방지 가능
            System.out.println("#"+i+" "+Math.round((float)sum/8));
        }
    }
}
