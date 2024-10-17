package newpack;

import java.util.Scanner;

public class mthd_2
{
    public static int sum(int num1, int num2)
    {
        int add = num1+num2;
        return add;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();
        int add = sum(num1 , num2);
        System.out.println("sum is: " +add);
    }
}
