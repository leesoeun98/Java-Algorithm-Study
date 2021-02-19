package CodeUp;

import java.util.Scanner;

public class test {
    static int map[][] = new int[10][10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int x =1;
        int y=1;

        while(true){
            if(map[x][y]==2){
                map[x][y]=9;
                break;
            }
            if(map[x][y+1]==1){
                if(map[x+1][y]==1) break;
                else x++;
            }else if(map[x][y+1]!=1){
                y++;
            }
            if(map[x][y]==2){
                map[x][y]=9;
                break;
            }
            map[x][y]=9;
        }
        map[1][1]= 9;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
 }
