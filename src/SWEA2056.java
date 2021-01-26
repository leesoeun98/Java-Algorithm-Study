import java.util.Scanner;

public class SWEA2056 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        //이런 문제일 경우 배열에 각 일을 넣고 매핑하자
        int calendar[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 1; i <= T; i++) {
            String date = sc.next();
            String year = date.substring(0, 4);
            String month = date.substring(4, 6);
            String day = date.substring(6, 8);
            boolean flag =true;

            for(int j=1;j<13;j++){
                //1일부터 각 달에 해당하는 일수 사이에 있으면 flag = true
                if(1<=Integer.parseInt(day)&& Integer.parseInt(day)<=calendar[Integer.parseInt(month)]){
                    flag = true;
                }else{
                    flag = false;
                }
            }
            if(flag){
                System.out.println("#"+i+" "+year+"/"+month+"/"+day);
            }else{
                System.out.println("#"+i+" "+-1);
            }

        }
    }
}
