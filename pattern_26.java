package Star;

public class pattern_26 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            //1
            for(int j=i;j<=n;j++)
            {
                if(i==1||j==n||j==i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
                
            }
            //2
            for(int k=1;k<i;k++)
            {
                System.out.print("  ");
            }
            //3
            for(int l=1;l<i;l++)
            {
                System.out.print("  ");
            }
            //4
            for(int x=i;x<=n;x++)
            {
                if(i==1||x==i||x==n)
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
        
        for(int i=2;i<=n;i++)
        {
            //5
            for(int j=1;j<=i;j++)
            {
                if(j==1||i==n||j==i)
                {
                   System.out.print("* "); 
                }
                else
                {
                    System.out.print("  ");
                }
                
            }
            //6
            for(int k=i;k<n;k++)
            {
                System.out.print("  ");
            }
            //7
            for(int l=i;l<n;l++)
            {
                System.out.print("  ");
            }
            //8
            for(int z=1;z<=i;z++)
            {
                if(z==1||i==n||z==i)
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
