package newpack;

import java.util.Scanner;

public class mthd_3
{
    public static int calMultiply(int num1, int num2)
    {
        int multiply = num1*num2;
        return multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();
        int multiple = calMultiply(num1 , num2);
        System.out.println("Multiplication is: " + multiple);
    }
}
