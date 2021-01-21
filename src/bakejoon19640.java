import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class bakejoon19640 {
    static class Person implements Comparable<Person> {
        int num;
        int lineNumber;
        int workDay;
        int hurry;

        public Person(int lineNumber, int workDay, int hurry, int num) {
            this.lineNumber = lineNumber;
            this.workDay = workDay;
            this.hurry = hurry;
            this.num = num;
        }

        @Override
        public int compareTo(Person p) {
            if (this.workDay == p.workDay) {
                int hurry = p.hurry - this.hurry;
                if (hurry == 0) return this.lineNumber - p.lineNumber; //lineNumber 더 작아야 먼저
                return hurry;
            }
            return p.workDay - this.workDay;
        }
    }

    static int m;
    static PriorityQueue<Person> wclines = new PriorityQueue<Person>();

    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        m = scan.nextInt();
        int k = scan.nextInt(); //데카는 k+1번
        int count = 0;
        LinkedList<Person>[] employee = new LinkedList[m];
        for (int i = 0; i < m; i++) employee[i] = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int lineNumber = i % m;
            int work = scan.nextInt();
            int hurry = scan.nextInt();
            employee[lineNumber].add(new Person(lineNumber, work, hurry, i));
        }
        //person 순대로 wclines에 넣음
        for (int i = 0; i < m; i++) {
            Person person = employee[i].remove(0); //각 줄의 head가 wclines에 들어감
            wclines.add(person);
        }
        while (!wclines.isEmpty()) {
            count++;
            Person p = wclines.poll(); //각 head에서 가장 우선인 한 명 화장실 감
            if(p.num==k) break;
            if(employee[p.lineNumber].size()==0) continue; //각 줄에 사람 없으면 그 줄은 건너뜀
            wclines.add(employee[p.lineNumber].remove(0));
            //한 명 화장실 갔으니 한 명 wclines에 추가, 각 줄의 head에 해당하는 lineNumber의 다음 선두가 들어옴
        }
        System.out.println(count-1);
    }
}
