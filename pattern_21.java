package Star;

public class pattern_21 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int k=i;k<=n;k++)
            {
                if(i==1||k==n||i==k)
                {
                    System.out.print("* ");
                } 
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
