package newpack;

public class array1
{
    public static void main(String[] args)
    {

        int [] marks = new int [3];  // new is used to allocate space for non premitive variable in the memory.
        marks[0] = 97;
        marks[1] = 91;
        marks[2] = 95;
        for (int i=0; i< marks.length; i++)
        {
            System.out.print(marks[i]+" ");
        }
    }
}