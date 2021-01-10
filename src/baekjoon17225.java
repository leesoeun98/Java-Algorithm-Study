import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon17225 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = scan.nextInt();
		int jgift = 0;
		int sgift = 0;
		int scount = 0;
		int jcount = 0;
		int gift = 1;
		int stime = -1;
		int jtime = -1;

		ArrayList<Integer> sangmin = new ArrayList<Integer>();
		ArrayList<Integer> jisoo = new ArrayList<Integer>();
		ArrayList<Integer> sangmingift = new ArrayList<Integer>();
		ArrayList<Integer> jisoogift = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			int time = scan.nextInt();
			String color = scan.next();
			int m = scan.nextInt();

			if (color.equals("B")) {
				// if(stime>time) time=stime;
				for (int j = 0; j < m; j++) {
					// 앞의 선물 포장 끝나고 다음 포장 시작 고려
					if (sangmin.size() > 0 && time < sangmin.get(sangmin.size() - 1) + a) {
						time = sangmin.get(sangmin.size() - 1) + a;
					}
					sangmin.add(time);
					time += a;
					sgift += 1;
				}
			} else {
				for (int j = 0; j < m; j++) {
					if (jisoo.size() > 0 && time < jisoo.get(jisoo.size() - 1) + a) {
						time = jisoo.get(jisoo.size() - 1) + a;
					}
					jisoo.add(time);
					time += b;
					jgift += 1;
				}

			}

		}

		// 시간 순대로 선물 순서 정하는 부분
		while (jgift - 1 >= jcount && sgift - 1 >= scount) {

			if (sangmin.get(scount) == jisoo.get(jcount)) {
				sangmingift.add(gift);
				gift++;
				scount++;
				jisoogift.add(gift);
				gift++;
				jcount++;
			} else if (sangmin.get(scount) > jisoo.get(jcount)) {
				jisoogift.add(gift);
				gift++;
				jcount++;
			} else {
				// 나중이므로 상민이 선물이 먼저
				sangmingift.add(gift);
				gift++;
				scount++;
			}
		}
		// 마지막 값 출력
		while (jcount < jgift) {
			jisoogift.add(gift);
			jcount++;
			gift++;
		}
		while (scount < sgift) {
			sangmingift.add(gift);
			scount++;
			gift++;
		}

		// 정답 출력
		System.out.println(scount);
		for (int i : sangmingift) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(jcount);
		for (int i : jisoogift) {
			System.out.print(i + " ");
		}

	}

}
