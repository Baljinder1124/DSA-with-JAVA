package newpack;

import java.util.Arrays;
import java.util.Scanner;

public class array4
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements: ");
        int ele[] = new int[size];
        for (int i=0; i<size; i++)
        {
             ele[i] = sc.nextInt();
        }
        Arrays.sort(ele);

        System.out.println("Minimum Element: "+ele[0]);
        System.out.println("Maximum Element: "+ele[size-1]);
    }
}
