package SWEA;

import java.util.Scanner;

public class SWEA2058 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String num = sc.next();
//        int sum =0;
//        for(int i=0;i<num.length();i++){
//            sum+=Integer.parseInt(String.valueOf(num.charAt(i)));
//        }
//        System.out.println(sum);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println(sum);
    }
}
