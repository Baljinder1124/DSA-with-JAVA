package newpack;

import java.util.Scanner;

public class calcii
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number here :  ");
        int a = sc.nextInt();

        System.out.println("Enter your second number here :  ");
        int b = sc.nextInt();

        System.out.println("Press '1' for ADDITION.....Press '2' for SUBTRACTION.....Press '3' for MULTIPLICATION.....Press '4' for DIVISION.....Press '5' for MODULO.");

        int symbol = sc.nextInt();

        switch (symbol)
        {
            case 1:
                System.out.println("RESULT: " + a+b);
                break;
            case 2:
                System.out.println("RESULT: " + (a-b));
                break;
            case 3:
                System.out.println("RESULT: " + a*b);
                break;
            case 4:
                System.out.println("RESULT: " + a/b);
                break;
            case 5:
                System.out.println("RESULT: " + a%b);
                break;
            default:
                System.out.println("INVALID input..........   :)");
        }
    }
}
