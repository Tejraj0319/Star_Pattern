package Star;

import java.util.Scanner;

public class pattern_7 {
public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n=sc.nextInt();

        System.out.println();

        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
    
}
