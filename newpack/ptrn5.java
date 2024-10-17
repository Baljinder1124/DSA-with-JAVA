package newpack;

public class ptrn5
{
    public static void main(String[] args) {
        int i,j;
        for (i=1; i<=5; i++)
        {
            for (j=1; j<=i; j++)   // j<=5-i+1
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}