// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.Scanner;
import java.util.Scanner;
public class journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] abc = new int[3];
            for(int i=0;i<3;i++)
            abc[i] = sc.nextInt();
            
            int days = 0;
            int sum = abc[0] + abc[1] + abc[2];
            int div = n/sum;
            days += 3*div;
            // int rem = n - 3 * div;
            n -= div*sum;
            if(0<n){
            n -= abc[0];
            days++;
            // System.out.println(0);
            
            }
            if(n>0){
            n -= abc[1];
            days++;
            // System.out.println(1);
            }
            if(0<n){
            n -= abc[2];
            days++;
            // System.out.println(2);
            }
        
            System.out.println(days);
        }
        
    }
}