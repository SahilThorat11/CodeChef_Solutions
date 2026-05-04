import java.util.Scanner;

class CricketWorldCupQualifier
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Points = sobj.nextInt();

        if(Points >= 12)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        sobj.close();
    }
}

