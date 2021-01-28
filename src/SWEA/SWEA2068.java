package SWEA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SWEA2068 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            /*
            *  ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<10;j++){
                arr.add(sc.nextInt());
            }
            System.out.println("#"+i+" "+ Collections.max(arr));
            * */
            int max = 0;
            int num;
            for (int j = 0; j < 10; j++) {
                num = sc.nextInt();
                if (max <= num) {
                    max = num;
                }
            }
            System.out.println("#"+i+1+" "+max);
        }
    }
}
