package Star;

public class pattern_20 {
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for( int  j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                if(i==n||k==1||k==i)
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
