package newpack;

import java.util.ArrayList;
import java.util.List;

public class digtfreqncy
{
    public static void main(String[] args)
    {
        int num = 1122890;
        int i,o, k;
        int count = 0;
        List<Integer> arr1 = new ArrayList<>();
         while(num>0)
        {
            o = num % 10;
            num = num/10;
            arr1.add(0, o);
        }
            for (i=0; i< arr1.size(); i++)
            {
               for(k=0; k<arr1.size(); k++)
                {
                    if (i == arr1.get(k))
                    {
                        count++;
                    }
                    if (k == arr1.size()-1){
                        System.out.println(arr1.get(i)+ " : " + count);
                        count = 0;

                    }

                }
            }
    }
}