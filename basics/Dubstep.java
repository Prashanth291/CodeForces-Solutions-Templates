import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String s ="WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB";
        while (s.indexOf("WUB") == 0) {
            s = s.substring(3,s.length());
        }
        StringBuilder ans = new StringBuilder();
        while(s.indexOf("WUB") != -1)
        {
            int idx = s.indexOf("WUB");
            ans.append(s.substring(0,idx));
            if(ans.length()>0 && ans.charAt(ans.length()-1) != ' ') ans.append(' ');
            s = s.substring(idx+3,s.length());
        }
        ans.append(s);
        System.out.println(ans.toString());
    }
}
//WE ARE THE CHAMPIONS MY FRIEND 