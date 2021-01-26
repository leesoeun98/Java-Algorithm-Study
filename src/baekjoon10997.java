import java.util.Scanner;

public class baekjoon10997 {
    static char stars[][];

    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 4 * n - 3;
        int col = row + 2;
        stars=new char[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                stars[i][j] = ' ';
            }
        }
        printStars(row - 1, 0, n);
        for (int i = 0; i < col; i++) {
            if(i==1){
                System.out.println("*");
                continue;
            }
            System.out.println(stars[i]);
        }
    }

    static void printStars(int x, int y, int size) {
        if (size == 1) {
            stars[y][x] = '*';
            return;
        }

        int row = 4 * size - 3;
        int col = row + 2;

        //왼쪽으로 width 만큼
        for (int i = row - 1; i >= 0; i--) {
            stars[y][x-i]='*';
        }
        //밑으로 height 만큼
        for (int i = 0; i <col; i++) {
            stars[y+i][x-row+1]='*';
        }
        //오른쪽으로 width 만큼
        for (int i = 0; i <row; i++) {
            stars[y+col-1][x-row+1+i]='*';
        }
        //위로 height-2만큼
        for (int i = 0; i <col-2; i++) {
            stars[y+col-1-i][x]='*';
        }
        //왼쪽으로 1만큼
        stars[y+2][x-1]='*';

        if(size==2){
            for(int i=1;i<3;i++){
                stars[y+2+i][x-2]='*';
            }
        }
        //재귀
        printStars(x - 2, y + 2, size - 1);
        return;
    }

}
