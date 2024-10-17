package newpack;

import java.util.Scanner;

public class mthd_14
{
    public static void main(String[] args) {
        int i, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you want print in FIBONACCI series: ");
        int n = sc.nextInt();
        int a=0, b=1;
        System.out.print(a+" "+b+" ");
        for (i=0; i<=n; i++)
        {
            sum = a+b;
            a=b; b=sum;
            System.out.print(sum +" ");
        }
    }
}