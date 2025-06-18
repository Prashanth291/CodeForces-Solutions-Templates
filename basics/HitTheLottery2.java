import java.util.Scanner;

public class HitTheLottery2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bills = {100,20,10,5,1};
        int n = sc.nextInt();
        int cnt = 0,i=0;
        while(n!=0)
        {
            if(n>=bills[i])
            {
                n -= bills[i];
                cnt++;
            }
            else{
                i++;
            }
        }
        System.out.println(cnt);
    }
}
