package newpack;

import java.util.Scanner;

public class array3
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the names: ");
        String names[] = new String[size];
        for (int i=0; i<size; i++)
        {
            names[i] = sc.next();
        }

        System.out.println("Array of names: ");
        for (int i=0; i<size; i++)
        {
            System.out.print(names[i]+" ");
        }
    }
}
