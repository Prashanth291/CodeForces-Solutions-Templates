import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mna = new int[3];
        for(int i=0;i<3;i++)
        {
            mna[i] = sc.nextInt();
        }
        // int row = Math.ceil(mna[0]/mna[2])!=0 ?(int) Math.ceil(mna[0]/mna[2]) : 1;
        // int col = Math.ceil(mna[0]/mna[2])!=0 ?(int) Math.ceil(mna[1]/mna[2]) : 1;
        long row = (int) Math.ceil((double)mna[0]/mna[2]);
        long col = (int) Math.ceil((double)mna[1]/mna[2]);
        System.out.println((long)row * col);
    }
}

