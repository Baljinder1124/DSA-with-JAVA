package newpack;

import java.util.Arrays;

public class minmax
{
    public static void main(String[] args)
    {
        int arr1[] = {45, 34, 12, 92, 54};
        Arrays.sort(arr1);
        int i;
        System.out.println("SORTED array: ");
        for(i=0; i<arr1.length; i++)
        {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.print("MAXIMUM valued element: " + arr1[0]);
        System.out.println("    MINIMUM valued element: " + arr1[arr1.length-1]);
    }
}
