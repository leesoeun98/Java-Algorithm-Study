package SWEA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SWEA1959 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int size1 = sc.nextInt();
            int size2 = sc.nextInt();
            int arr1[]= new int [size1];
            int arr2[]= new int [size2];
            ArrayList<Integer> result = new ArrayList<>();
            for(int j=0;j<size1;j++){
                arr1[j]=sc.nextInt();
            }
            for(int j=0;j<size2;j++){
                arr2[j]=sc.nextInt();
            }
            if(size1>size2){
                for(int j=0;j<size1-size2+1;j++){
                    int sum=0;
                    for(int k=0;k<size2;k++){
                        sum+=arr1[j+k]*arr2[k];
                    }
                    result.add(sum);
                }
            }else{
                for(int j=0;j<size2-size1+1;j++){
                    int sum=0;
                    for(int k=0;k<size1;k++){
                        sum+=arr2[j+k]*arr1[k];
                    }
                    result.add(sum);
                }
            }
            //출력
            System.out.println("#"+i+" "+ Collections.max(result));
        }
    }
}
