package newpack;

public class peak
{
    public static void main(String[] args)
    {
        int arr1[] = {1,5,2,7,5,8,12,6,78};
        int i, n=9, count=0;
        for(i=1; i<=n-2; i++)
        {
            if (arr1[i]>arr1[i-1] && arr1[i]>arr1[i+1])
            {
                count++;
                System.out.println(i +" : "+ arr1[i]);
            }
        }
        System.out.println("COUNT: "+count);
    }
}
