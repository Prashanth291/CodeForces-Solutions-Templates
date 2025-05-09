import java.util.Scanner;
public class legs {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            if(n%4==0) System.out.println(n/4);
            else System.out.println(n/4+1);
            
        }
        sc.close();
    }
}