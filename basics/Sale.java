import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            if(num<=0) pq.offer(num);
            if(pq.size()>m) pq.poll();
        }
        int ans = 0;
        while(!pq.isEmpty()) ans += pq.poll();
        System.out.println(-ans);
    }
}

// 756 -611 251 -66 572 -818 ??1495