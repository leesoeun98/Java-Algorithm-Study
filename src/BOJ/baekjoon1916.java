package BOJ;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class baekjoon1916 {

    static int v, e;
    static int[][] adj;
    static int distance[];
    static boolean check[];
    static int start, end;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt(); // 노드 수 == 도시 수
        e = sc.nextInt(); // 간선 수 == 버스 수
        adj = new int[v + 1][v + 1];
        for (int[] arr : adj) Arrays.fill(arr, -1);
        for (int i = 0; i < e; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int price = sc.nextInt();
            //여기 중요, 동일한 경로에 다양한 price 들어옴 
            if (adj[from][to] == -1) {
                adj[from][to] = price;
            } else if (adj[from][to] > price) {
                adj[from][to] = price;
            }
        }
        start = sc.nextInt();
        end = sc.nextInt();

        distance = new int[v + 1];
        check = new boolean[v + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        dijkstra();
        for (int d : distance) System.out.println(d);
    }

    public static void dijkstra() {
        distance[start] = 0;

        for (int i = 0; i < v - 1; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            //min, minIndex 갱신
            for (int j = 1; j <= v; j++) {
                if (!check[j] && min > distance[j]) {
                    min = distance[j];
                    minIndex = j;
                }
            }
            check[minIndex] = true;

            for (int to = 1; to <= v; to++) {
                if(adj[minIndex][to]!=-1 && distance[to]>distance[minIndex]+adj[minIndex][to]){
                    distance[to]=distance[minIndex]+adj[minIndex][to];
                }
            }
        }
    }
}
