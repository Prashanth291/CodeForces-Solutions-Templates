import java.util.Scanner;

public class OddGrasshoper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long start = sc.nextLong(), n = sc.nextLong();
            long div = (long)Math.ceil((double)n/(double)4);
            long flor = (long)Math.floor((double)n/(double)4);
            n = n % 4;
            if(start%2==0)
            {
                if( n == 0)
                {
                    System.out.println(start);
                }
                else if(n == 1)
                {
                    System.out.println(start-flor*4-1);
                }
                else if(n==2)
                {
                    System.out.println(start+1);
                }
                else
                {
                    System.out.println(start+div*4);
                }
            }
            else{
                if( n == 0)
                {
                    System.out.println(start);
                }
                else if(n == 3)
                {
                    System.out.println(start-div*4);
                }
                else if(n==2)
                {
                    System.out.println(start-1);
                }
                else
                {
                    System.out.println(start+flor*4+1);
                }
            }
        }
    }
}


/*
 * 
 * 
 * InputCopy
9
0 1
0 2
10 10
10 99
177 13
10000000000 987654321
-433494437 87178291199
1 0
-1 1
OutputCopy
-1
1
11
110
190
9012345679
-87611785637
1
0
 */