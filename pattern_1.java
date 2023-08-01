package Star;

import java.util.Scanner;

public class pattern_1 
{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n=sc.nextInt();

        System.out.println();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
