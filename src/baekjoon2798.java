import java.util.*;

public class baekjoon2798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int max=0;
		int sum=0;
		int[] cards=new int[n];
		
		for(int i=0; i<n; i++) {
			cards[i]=scan.nextInt();
		}
		// 모든 카드의 조합을 다 구해서 sum을 구하고, sum 중 최댓값을 찾아 출력한다. 
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n;k++) {
					sum=cards[i]+cards[j]+cards[k];
					if(sum<=m && max<sum) {
						max=sum;
					}
					sum=0;
				}
			}
		}

		System.out.println(max);
		
	}

}
