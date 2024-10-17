package newpack;

import java.util.Scanner;

public class cndnstatmnt
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");

        int num2 = sc.nextInt();

        if(num1 == num2)
        {
            System.out.println("Both numbers are equal");
        }

        else if (num1>num2)
            {
                System.out.println(num1 + " is greater.");
            }

        else if (num1<num2)
            {
                System.out.println(num2 + " is greater.");
            }
        int button = sc.nextInt();
        switch (button)
        {
            case 1:
                System.out.println("HELLO");
                break;
            case 2:
                System.out.println("NAMASTE");
                break;
            case 3:
                System.out.println("BONJOUR");
                break;
            default:
                System.out.println("Ooooopss......!! INVALID button");
        }
    }
}