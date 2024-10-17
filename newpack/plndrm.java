package newpack;

public class plndrm
{
    public static void main(String[] args)
    {
        int num = 5235, sum=0;
        int t = num;
        while (num > 0)
        {
            int r = num % 10;
            sum = (sum + r)*10;
            num = num / 10;
        }
        if (sum == t*10) {
            System.out.println(t + " is a PALLINDROME.");
        }
        else {
            System.out.println(t + " is not a PALLINDROME.");
        }
    }
}