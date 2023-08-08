package Star;

public class pattern_9 
{
    public static void main(String[] args) 
    {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int k=i;k<=n;k++)
            {
                System.out.print("* ");
            }
            for(int z=i+1;z<=n;z++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
