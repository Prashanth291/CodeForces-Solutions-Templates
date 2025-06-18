import java.util.Scanner;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String x = sc.nextLine();
            String s = sc.nextLine();
            int cnt =0;
            boolean flag = false;
            while(true)
            {
                // System.out.println(x+" "+s);
                if(x.equals(s))
                {
                    flag = true;
                    break;
                }
                cnt++;
                x += x;
                if(x.indexOf(s) != -1)
                {
                    flag = true;
                    break;
                }
                if(x.length()>s.length()) break;
            }
            System.out.println(flag ? cnt : -1);;
        }
    }
}
