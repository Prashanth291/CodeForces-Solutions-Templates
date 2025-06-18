import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[3];
        for(int i=0;i<3;i++)
        {
            abc[i] = sc.nextInt();
        }
        System.out.println(Math.max(Math.max(abc[0]*(abc[1] + abc[2]),abc[0]*(abc[1]*abc[2])), Math.max(abc[0]+(abc[1]*abc[2]), (abc[1] + abc[0])*abc[2])));
        sc.close();
    }
}
