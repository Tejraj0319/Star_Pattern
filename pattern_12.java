package Star;

public class pattern_12 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<i;k++)
            {
                System.out.print("  ");
            }
            for(int l=1;l<i;l++)
            {
                System.out.print("  ");
            }
            for(int x=i;x<=n;x++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=i;k<n;k++)
            {
                System.out.print("  ");
            }
            for(int l=i;l<n;l++)
            {
                System.out.print("  ");
            }
            for(int z=1;z<=i;z++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
