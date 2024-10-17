package newpack;

public class target
{
    public static void main(String[] args)
    {
        int arr1[] = {4, 7, 10, 12, 31};
        int target = 10;
        int i;
        for(i=0; i< arr1.length; i++)
        {
            if(arr1[i] == target)
            {
                System.out.println("TARGET is: "+ arr1[i]);
                System.out.println("INDEX number is: "+ i);
                System.out.println("TARGET found at index "+ i +" i.e. "+ arr1[i]);
            }
        }
    }
}
