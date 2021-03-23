package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1916 {

    static int v, e;
    static int[][] adj;
    static long distance[];
    static boolean check[];
    static int start, end;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();
        adj = new int[v + 1][v + 1];
        for (int arr[] : adj) Arrays.fill(arr, -1);
        for (int i = 0; i < e; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int price = sc.nextInt();
            if (adj[from][to] == -1) {
                adj[from][to] = price;
            } else if (adj[from][to] > price) {
                adj[from][to] = price;
            }
        }
        start = sc.nextInt();
        end = sc.nextInt();

        distance = new long[v + 1];
        check = new boolean[v + 1];
        for (int i = 1; i <= v; i++) {
            distance[i] = Integer.MAX_VALUE - 1;
            check[i] = false;
        }

        distance[start] = 0;

        for (int i = 0; i < v - 1; i++) {
            long min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 1; j <= v; j++) {
                if (!check[j] && min > distance[j]) {
                    min = distance[j];
                    minIndex = j;
                }
            }
            check[minIndex] = true;
            for (int to = 1; to <= v; to++) {
                if (distance[minIndex] != Integer.MAX_VALUE - 1 && adj[minIndex][to] != -1 && distance[to] > distance[minIndex] + adj[minIndex][to]) {
                    distance[to] = distance[minIndex] + adj[minIndex][to];
                }
            }
        }
        System.out.println(distance[end]);
    }
}
