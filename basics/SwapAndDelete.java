import java.util.Scanner;

public class SwapAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            int n = s.length();
            int[] freq = {0,0};
            for(char ch:s.toCharArray())
            {
                freq[ch-'0']++;
            }
            int ans = 0;
            
            for(int i = 0;i<n;i++){
                int idx = s.charAt(i)-'0';
                int comp = idx == 1 ? 0:1;
                if(freq[comp] == 0)
                {
                    ans = n - i;
                    break;
                }
                freq[comp]--;
            }
            System.out.println(ans);
        }
    }
}
