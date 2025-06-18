import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {5,4,3,2,1};
        int ans = 0;
        int i =0;
        while(n>0)
        {
            if(n>=arr[i])
            {
                ans += (int)Math.floor(n/arr[i]);
                n = n%arr[i];
            }
            else i++;
        }
        System.out.println(ans);
        sc.close();
    }
}
