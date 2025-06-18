public class demo {
    public static void main(String[] args) {
        int n = 3;
        for(int i=0;i<32;i++)
        {
            if((n & i) == 0)
            {
                return i;
            }
        }
        
    }
}
