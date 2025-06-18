import java.util.Scanner;

public class MakeItDivivbleby25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            int n = s.length();
            int min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
            int cnt1 = 0, cnt2 = 0;
            int i =  n-1;
            boolean flag5 = true,flag0 = true;
            while(i>=0 && s.charAt(i) != '5')
            {
                i--;
                cnt1++;
            }
            // System.out.println("Stage:/5"+cnt1);
            if(i>=0 && s.charAt(i) == '5')
            {
                i--;
                while(i>=0 && (s.charAt(i) != '2' && s.charAt(i) != '7'))
                {
                    // System.out.println("s["+i+"]:"+s.charAt(i));
                    i--;
                    cnt1++;
                }
                if(i<0) flag5 = false;
            }
            // System.out.println("Stage:/27"+cnt1);

            i = n - 1;
            while(i>=0 && s.charAt(i) != '0')
            {
                i--;
                cnt2++;
            }
            if(i>=0 && s.charAt(i) == '0')
            {
                i--;
                while(i>=0 && (s.charAt(i) != '5' && s.charAt(i) != '0'))
                {
                    i--;
                    cnt2++;
                }
                if(i<0) flag0 = false;
            }
            // System.out.println(cnt1+" "+cnt2);
            System.out.println((flag5 || flag0) ? Math.min(cnt1,cnt2) : 0);
        }
    }
}


/*
 * InputCopy
5
100
71345
3259
50555
2050047
OutputCopy
0
3
1
3
2
 */