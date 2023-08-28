package Star;

public class pattern_22 {
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=1;i<n;i++)
        {
            //1
            for(int j=i;j<=n;j++)
            {
                System.out.print("- ");
            }
            //2
            for(int k=1;k<=i;k++)
            {
                if(k==1)
                {
                   System.out.print("* "); 
                }
                else
                {
                    System.out.print("- ");
                }
            }
            //3
            for(int x=2;x<=i;x++)
            { 
                if(x==i)
                {
                    System.out.print("* ");
                }else
                {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            //4
            for(int j=1;j<=i;j++)
            {
                System.out.print("- ");
            }
            //5
            for(int k=i;k<=n;k++)
            {
                if(k==i)
                {
                    System.out.print("* ");  
                }
                else
                {
                    System.out.print("- ");
                }
            }
            //6
            for(int x=i+1;x<=n;x++)
            {
                if(x==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
