package newpack;

import java.util.Scanner;

public class mthd_8
{
    public static double crcmfrnc(double radii)
    {
        double pi = 3.141;
         double c = 2*pi*radii;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double r = sc.nextInt();
        double circumference = crcmfrnc(r);
        System.out.println("Circumference of Circle: "+ circumference);
    }
}
