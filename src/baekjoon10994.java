import java.util.Scanner;

public class baekjoon10994 {
    static char stars[][];

    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 4 * n - 3;
        int col = 4 * n - 3;
        stars = new char[row][col];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                stars[i][j] = ' ';
            }
        }
        printStars(0, 0, n);
        for (int i = 0; i < col; i++) {
            System.out.println(stars[i]);
        }
    }

    static void printStars(int x, int y, int size) {
        if (size == 1) {
            stars[y][x] = '*';
            return;
        }
        int row = 4 * size - 3;
        int col = 4 * size - 3;

        for (int i = 0; i < col; i++) {
            stars[y + i][x] = '*';
            stars[y + i][x + row - 1] = '*';
        }
        for (int i = 0; i < row; i++) {
            stars[y][x + i] = '*';
            stars[y + col - 1][x + i] = '*';
        }
        printStars(x + 2, y + 2, size - 1);
        return;
    }
}
