class peak
{    
    public static void main(String[] args) 
    {
        int arr1[] = {1,5,2,7,5,8,12,6,78};
        int i;
        for(i=0; i<arr1.length; i++)
        {
            if (arr1[i]>arr1[i+1] && arr1[i+1]>arr1[i+2]) 
            {
                System.out.println(i +" : "+ arr1[i]);
            }
        }
    }
}