import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class T_primes {
    public static void main(String[] args) {
        int MAX = (int) 1e6 + 1;
        boolean[] primes = new boolean[MAX];
        Arrays.fill(primes,true);
        primes[0] = primes[1] = false;
        for(int i=2;i*i<MAX;i++)  // sqrt(10^6)
        {
            if(primes[i])
            {
                for(int j = i*i;j<MAX;j += i)
                {
                    primes[j] = false;
                }
            }
        }

        Set<Long> set = new HashSet<>();
        for(int i=2;i<MAX;i++)
        {
            if(primes[i])
            {
                set.add(1L *i*i);
            }
        }
        // System.out.println("Set" + set);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // long[] nums = new long[n];
        for(int i=0;i<n;i++)
        {
            long num = sc.nextLong();
            System.out.println(set.contains(num) ? "YES" : "NO");
        }
    }
    
}
