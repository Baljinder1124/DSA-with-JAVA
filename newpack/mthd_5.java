package newpack;

import java.util.Scanner;

public class mthd_5
{
    public static float AVERAGE(int a, int b, int c)
    {
        int avrg = (a+b+c)/3;
        return avrg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers to get the average: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float average = AVERAGE(a, b, c);
        System.out.println("Average of three numbers is: "+average);
    }
}
