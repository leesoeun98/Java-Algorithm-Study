package SWEA;

import java.util.Scanner;

public class SWEA1948 {
    static int month_date[]=new int []{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            int startmonth = sc.nextInt();
            int startdate = sc.nextInt();
            int endmonth = sc.nextInt();
            int enddate = sc.nextInt();
            int result = 0;
            if(startmonth==endmonth) result = enddate-startdate+1;
            else{
                for(int j=startmonth+1;j<endmonth;j++){
                    result+=month_date[j];
                }
                result+=month_date[startmonth]-startdate+1;
                result+=enddate;
            }
            System.out.println("#" + i + " " + result);
        }
    }
}
