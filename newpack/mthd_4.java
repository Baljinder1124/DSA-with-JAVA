package newpack;

import java.util.Scanner;

public class mthd_4
{
    public static int FACT(int n)
    {
        if (n<0)
        {
            System.out.println("INVALID input");
            return n;
        }
        int fact=1, i;
        for (i=n; i>=1; i--)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get FACTORIAL: ");
        int num1 = sc.nextInt();
        int factorial = FACT(num1);
        System.out.println("FACTORIAL of "+num1+" is: " +factorial);
    }
}
