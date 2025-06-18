import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        String[] sts = new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            sts[i] = sc.nextLine();
            if(map.containsKey(sts[i]))
            {
                System.out.println(sts[i]+String.valueOf(map.get(sts[i])));
                map.put(sts[i],map.get(sts[i])+1);
            }
            else{
                System.out.println("OK");
                map.put(sts[i],1);
            }
        }
    }
}

/*
 * 4
abacaba 1
acaba 1
abacaba 2
acab
 */
