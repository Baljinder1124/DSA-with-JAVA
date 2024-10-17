package newpack;

import java.util.Scanner;

public class mthd_9 {
    public static void adult(int a)
    {
        if (a>18)
        {
            System.out.println("Ypu are an ADULT of "+a+" years, you can VOTE for any candidate you choose.");
        }
        else {
            System.out.println("You are a MINOR, please DON'T VOTE,");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        adult(age);
    }
}
