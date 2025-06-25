import java.util.Scanner;

public class MakeAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            boolean ac = false, ab = false, bc = false;
            // if a and c
            int dac = a+(c-a)/2;
            if(dac%b == 0) ac = true;
            int dab = b-a;
            if((b+dab)%c == 0) ab = true;
            int dbc = c-b;
            if((b-dbc)%a == 0) bc = true;
            
            System.out.println((ab || bc || ac) ? "YES" : "NO");
        }
    }
}


/*
 * Example
InputCopy
11
10 5 30
30 5 10
1 2 3
1 6 3
2 6 3
1 1 1
1 1 2
1 1 3
1 100000000 1
2 1 1
1 2 2
OutputCopy
YES
YES
YES
YES
NO
YES
NO
YES
YES
NO
YES
 */
