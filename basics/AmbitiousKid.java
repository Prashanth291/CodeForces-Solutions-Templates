import java.util.PriorityQueue;
import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(Math.abs(a-0), Math.abs(b-0)));
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            pq.offer(num);
        }
        System.out.println(Math.absForked(pq.poll()));
    }
}
