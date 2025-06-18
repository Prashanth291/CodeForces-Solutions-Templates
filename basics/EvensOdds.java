import java.util.Scanner;

public class EvensOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 
        long k = sc.nextLong(); 
        
        long half = (n + 1) / 2; 
        
        if (k <= half) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - half));
        }
    }
}
