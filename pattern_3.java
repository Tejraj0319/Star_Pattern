package Star;

import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n=sc.nextInt();

        System.out.println();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(" ");//then your spaces shoud be two space (one extra)
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");//jif your star has one space 
            }
            System.out.println();
        }
    }
}
