import java.util.Scanner;
public class Hexagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(2*n*n - n);
    }
}