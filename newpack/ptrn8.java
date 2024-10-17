package newpack;

public class ptrn8
{
    public static void main(String[] args)
    {
        int n=5;

        //UPPER HALF
        // 1st half
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

                for (int j=1; j<=2*(n-i); j++)
                {
                    System.out.print(" ");
                }

                // 2nd half
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
//LOWER HALF
        for (int i=n; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            for (int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }

            // 2nd half
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}