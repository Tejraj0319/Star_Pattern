package Star;

public class pattern_25 {
    public static void main(String[] args) {
        int n=10;

        for(int i=1;i<=n;i++)
        {
            for( int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int k=i;k<=n;k++)
            {
                if(i==1||k==i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for( int x=i+1;x<=n;x++)
            {
                if(i==1||x==n)
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

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                if(k==1||i==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for(int z=2;z<=i;z++)
            {
                if(i==n||z==i)
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
