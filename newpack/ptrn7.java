package newpack;

public class ptrn7
{
    public static void main(String[] args) {
        int i,j;
        for (i=1; i<=5; i++)
        {
            for (j=1; j<=i; j++)   // j<=5-i+1
            {
                int sum=i+j;
                if (sum%2 == 0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}