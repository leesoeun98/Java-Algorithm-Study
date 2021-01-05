import java.util.*;

public class baekjoon10773 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=scan.nextInt();
		int sum=0;
		Stack <Integer> stack = new Stack<Integer>();
		
		//숫자 입력받아서 0이면 pop 0이 아니면 push 
		for(int i=0;i<count;i++) {
			int num=scan.nextInt();
			if(num!=0) {
				stack.push(num);
			}
			else {
				stack.pop();
			}
		}
		// 마지막에 stack의 sum 구하기 
		while(stack.size()>0) {
			sum+=stack.pop();
		}
		System.out.println(sum);

	}
}
