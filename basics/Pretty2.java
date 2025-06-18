import java.util.Scanner;

public class Pretty2 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] ans = new int[n];
            if(n%2==0)
            {
                for(int i=0;i<n;i+=2)
                {
                    ans[i] = i+2;
                    ans[i+1]=i+1;
                }
            }
            else{
                if(n>1)
                {
                    ans[0] =3;
                    ans[1]=1;
                    ans[2] = 2;
                    for(int i=3;i<n;i+=2)
                    {
                        ans[i] = i+2;
                        ans[i+1] = i+1;
                    }
                }
            }
            for(int num:ans)
            System.out.print(num+" ");;
            System.out.println();

        }
   }
}
