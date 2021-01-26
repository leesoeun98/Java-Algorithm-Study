import java.util.Scanner;

public class SWEA1926 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(game(i)>0){
                for (int j = 0; j < game(i); j++) {
                    System.out.print("-");
                }
                System.out.print(" ");
            }else{
                System.out.print(i+" ");
            }
        }
    }

    static int game(int i) {
        int count = 0;
        while (i > 0) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                count++;
            }
            i /= 10;
        }
        return count;
    }
}
