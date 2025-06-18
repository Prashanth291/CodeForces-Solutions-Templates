import java.util.HashMap;
import java.util.Scanner;

public class Dr_Tc {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0)
    {
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int ones = 0,zero=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='1') ones++;
            else zero++;
        }
        System.out.println(ones*(ones-1)+(ones+1)*zero);
    }
   } 
}
