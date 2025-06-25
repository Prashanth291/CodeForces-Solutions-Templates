import java.util.Scanner;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextLong();
            if(n%2==1 || n<4)
            {
                System.out.println(-1);
            }
            else{
                long dummy = n;
                long min =(long)Math.ceil((double)n/6), max = n/4;
                long rem1 = n%6;
                // if(rem1 == 4) min++;
                // long rem2 = n%4;
                System.out.println(min+" "+max);

            }
        }
    }// 900000000000000694

}
