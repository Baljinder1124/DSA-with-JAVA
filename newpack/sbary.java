package newpack;

public class sbary
{
    public static void main(String[] args)
    {
        int k;
        int arr1[] ={2, 3, 8, 7, 1, 2, 3};
        for(int i = 0; i<arr1.length; i++)
        {
            int sum=0;
            for (int j = i; j<arr1.length; j++)
            {
                for (k = i; k<=j; k++)
                {
                    System.out.print(arr1[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}