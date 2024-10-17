package newpack;

import java.util.Scanner;

public class mthd_11
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of digits you want to insert: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        System.out.println("Enter any "+n+ " digits.");

        for (int i = 0; i<=n-1; i++) {

            arr1[i] = sc.nextInt();
        }


        int c=0, count=0, add=0;


        for (int i = 0; i<=arr1.length-1; i++)
        {
           if (arr1[i]>0)
           {
               c++;
           }

           else if (arr1[i]<0)
           {
               count++;
           }


           else if (arr1[i] == 0)
           {
               add++;
           }
        }

        System.out.println("Total numbers of positive numbers are: "+c);
        System.out.println("Total numbers of negative numbers are: "+count);
        System.out.println("Total numbers of zeroes are: "+add);

    }
}
