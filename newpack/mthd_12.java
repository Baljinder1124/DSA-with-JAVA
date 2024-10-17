package newpack;

import java.util.Scanner;

public class mthd_12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any two numbers: ");

        int x = sc.nextInt();
        int n = sc.nextInt();

        int num=1;

        //Maths.pow(x,n);

        for(int i=1; i<=n; i++)
        {
            num = num*x;
        }

        System.out.println(x+" raised to the power "+n+" is = "+num);
    }
}