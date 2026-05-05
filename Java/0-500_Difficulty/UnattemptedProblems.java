import java.util.Scanner;

class UnattemptedProblems
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Problems = sobj.nextInt();
        int Attempted = sobj.nextInt();

        if(Problems < Attempted)
        {
            return;
        }

        System.out.println(Problems - Attempted);

        sobj.close();
    }
}