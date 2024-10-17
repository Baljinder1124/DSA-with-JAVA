package newpack;

public class sumarr
{
    public static void main(String[] args)
    {
        int arr[] = {11,22,33,44,55};
        int i, j, sum=0;
        for(i=0; i< arr.length; i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("SUM of the array is: " +sum);
        System.out.println("REVERSE of array: ");
        for (j= arr.length-1; j>=0; j--)
        {
            System.out.print(arr[j]+"  ");
        }
    }
}
