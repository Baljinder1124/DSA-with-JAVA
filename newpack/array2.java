package newpack;

import java.util.Scanner;

public class array2
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the number of which you want to know the index: ");
        int target = sc.nextInt();

        System.out.println("Enter the elements or numbers you want to store in the array: ");
        int digit[] = new int [size];

        for (int i=0; i<size; i++)
        {
            digit[i] = sc.nextInt();
        }

        for (int i=0; i<size; i++)
        {
            if (digit[i] == target)
            {
                System.out.println("The number you want to search is: " +digit[i]+" and the index of that number is: "+i);
            }
        }
    }
}
