import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray())
        {
            String sub = ch+"";
            if("aeiouy".contains(sub) || "AEIOUY".contains(sub))
            {
                continue;
            }
            else
            {
                sb.append('.');
                if(Character.isUpperCase(ch)) ch = Character.toLowerCase(ch);
                sb.append(ch);
            }

        }
        System.out.println(sb.toString());
    }
}
