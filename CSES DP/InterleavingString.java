import java.util.Scanner;

public class InterleavingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine(),req = sc.nextLine();
        System.out.println(rec(0,0,"",a,b,req));
    }
    private static boolean rec(int i,int j,String curr,String a,String b,String dest)
    {
        if(i == a.length() && j == b.length())
        {
             return dest.equals(curr);
        }
        // if(i>=a.length() || j>=b.length()) return false;
        boolean pickA = false,pickB = false;
        if(i<a.length())
        {
            pickA = rec(i+1,j,curr+a.charAt(i),a,b,dest);
        }
        if(j<b.length())
        {
            pickB = rec(i,j+1,curr+b.charAt(j),a,b,dest);
        }
        return pickA || pickB;

    }
}
// aadbbcbcac
// s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"