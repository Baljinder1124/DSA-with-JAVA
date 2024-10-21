package newpack;

import java.util.Scanner;

public class array5
{
    public static void main(String[] args)
    {
        int j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements in the array: ");
        int num[] = new int[size];

        for (int i=0; i<num.length; i++)
        {
            num[i] = sc.nextInt();
        }
        for (int i=0; i< num.length-1; i++)
        {
            for (j = 0; j < num.length-1; j++) {

                if (num[j] > num[j + 1]) {
                    int a = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = a;
                }
            }

        }
        for(int i=0; i< num.length; i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}