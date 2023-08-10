package Star;

public class pattern_11 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");
            }
            for(int k=i;k<n;k++)
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
