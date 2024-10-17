package newpack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class mthd_13
{
    public static void main(String[] args)
    {
        int n,i,t;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> arr1 = new ArrayList<>();
        if (a>b)
        {
           n = a;
        }
        else
        {
            n = b;
        }
        for (i=2; i<=n/2; i++)
        {
            if (a%i==0 && b%i==0)
            {
                t=i;
                arr1.add(0,t);

            }

        }
        System.out.println("GCD of two numbers "+a+" and "+b+" : "+arr1.getFirst());
    }
}
