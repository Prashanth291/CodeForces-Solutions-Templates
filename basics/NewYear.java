import java.util.Scanner;

public class NewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            boolean flag = false;
            for(int y = 0; y <= n / 2021; y++) {
                int remainder = n - 2021 * y;
                if(remainder >= 0 && remainder % 2020 == 0) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
