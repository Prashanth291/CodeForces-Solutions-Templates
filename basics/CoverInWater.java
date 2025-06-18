import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int ans = 0;
            
            if(s.contains("..."))
            {
                System.out.println(2);
            }
            else 
            {
                for(char ch:s.toCharArray()) if(ch == '.') ans++;
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
