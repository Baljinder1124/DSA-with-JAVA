package newpack;

import java.util.Scanner;

public class mthd_6
{
    public static int OddSum(int n)
    {
        int sum=0;
        for (int i=1; i<=n; i++)
        {

            if (i%2 != 0)
            {
                sum = sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to get the sum of all odd numbers between 1 to that number: ");
        int n = sc.nextInt();
        int oddSum = OddSum(n);
        System.out.println("Sum of all odd numbers from 1 to "+n+" is: "+oddSum);
    }
}
