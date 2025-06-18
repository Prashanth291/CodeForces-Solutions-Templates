import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int low=0,up=0;
        for(char ch:s.toCharArray())
        {
            int asc = ch - 65;
            if(0<=asc && asc<=26) up++;
            else low++;
        }
        System.out.println(up>low ? s.toUpperCase() : s.toLowerCase());
        sc.close();
    }
}
