package SWEA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA1946 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 1; i <= test; i++) {
            int n = sc.nextInt();
            ArrayList<String> answer = new ArrayList<>();
            String alphabet[] = new String[n];
            int alphabet_count[] = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                alphabet[j] = sc.next();
                alphabet_count[j] = sc.nextInt();
                sum += alphabet_count[j];
                for (int k = 0; k < alphabet_count[j]; k++) {
                    answer.add(alphabet[j]);
                }
            }
            System.out.println("#"+i);
            if (sum % 10 != 0) {
                for (int j = 0; j < (sum / 10) + 1; j++) {
                    List<String> ans;
                    if(j==(sum/10)) ans = answer.subList(j*10, sum);
                    else ans = answer.subList(j*10, j*10+10);
                    for(int k=0;k<ans.size();k++){
                        System.out.print(ans.get(k));
                    }
                    System.out.println();
                }
            }
            else{
                for (int j = 0; j < (sum / 10) + 1; j++) {
                    List<String> ans;
                    ans = answer.subList(j*10, j*10+10);
                    for(int k=0;k<ans.size();k++){
                        System.out.print(ans.get(k));
                    }
                    System.out.println();
                }
            }
        }
    }
}
