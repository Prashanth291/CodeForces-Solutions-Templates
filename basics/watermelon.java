import java.util.Scanner;
public class watermelon{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x==2) System.out.println("NO");
        else if(x%2==0)System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}