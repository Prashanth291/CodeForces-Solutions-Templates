import java.util.Scanner;
public class Bits{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLine();
            // sc.next();
        }
        for(String s:arr)
        {
            if(s.equals("X++") || s.equals("++X")) ans++;
            else if(s.equals("X--") || s.equals("--X")) ans--;
        }
        System.out.println(ans);
        sc.close();
       
    }
}