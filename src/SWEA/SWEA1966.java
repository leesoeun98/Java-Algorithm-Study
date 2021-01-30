package SWEA;

import java.util.Scanner;

public class SWEA1966 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int length = sc.nextInt();
            int arr[] = new int[length];
            //입력
            for (int j = 0; j < length; j++) {
                arr[j] = sc.nextInt();
            }
            //버블정렬
            for (int k = 0; k < length; k++) {
                //k 한 번 돌 때마다 제일 큰 수가 뒤로 감
                for (int j = 0; j < length -k- 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            //출력
            System.out.print("#" + i + " ");
            for (int number : arr) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
