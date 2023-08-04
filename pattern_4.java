package Star;

public class pattern_4 
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            for(int z=2;z<=i;z++)//it will start to print from 2nd row
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
