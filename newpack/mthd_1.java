package newpack;

// blocvk of code that takes input , do operations and provides output.

import java.util.Scanner;

public class mthd_1
{
    public static void printMyName(String name)
    {
        System.out.println("MY name is: "+name);
        return;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
    }
}
