import java.util.Scanner;

public class ExpensiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            
        }
    }
    public static int sumOfDigits(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
