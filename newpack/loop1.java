package newpack;

import java.util.Scanner;

public class loop1
{
    public static void main(String[] args)
    {
        int i,n,sum=0;
//        for (i=0; i<=10; i++)
//        {
//            System.out.println(i);
//        }
//        while (i<11)
//        {
//        System.out.println(i);
//        i++;
//        }

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i=1; i<=n; i++)
        {
            sum=sum+i;

        }
        System.out.println(sum);
    }
}
