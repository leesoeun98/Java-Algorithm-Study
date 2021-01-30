package SWEA;

import java.util.Scanner;

public class SWEA1961 {
    static int nums[][];
    static String result[][];

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int size = sc.nextInt();
            nums = new int[size][size];
            result = new String[size][3];
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    nums[j][k] = sc.nextInt();
                }
            }
            rotation90(size);
            rotation180(size);
            rotation270(size);
            //출력
            System.out.println("#"+i);
            for(int col=0;col<size;col++){
                for(int row=0;row<3;row++){
                    System.out.print(result[col][row]+" ");
                }
                System.out.println();
            }
        }
    }

    static void rotation90(int size) {
        for (int i = 0; i < size; i++) {
            String r="";
            for (int j = size-1; j >=0; j--) {
                r+=Integer.toString(nums[j][i]);
            }
            result[i][0]=r;
        }
    }
    static void rotation270(int size) {
        for (int i = 0; i < size; i++) {
            String r="";
            for (int j = 0; j <size; j++) {
                r+=Integer.toString(nums[j][i]);
            }
            //Integer.parseInt는 lading 0 제거 함
            result[size-i-1][2]=r;
        }
    }
    static void rotation180(int size) {
        for (int i = 0; i <size; i++) {
            String r="";
            for (int j = size-1; j >=0; j--) {
                r+=Integer.toString(nums[size-i-1][j]);
            }
            result[i][1]=r;
        }
    }
}
