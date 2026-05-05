import java.util.Scanner;

class BiryaniClass
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int T = sobj.nextInt();

        for(int i = T; i >= 1; i--)
        {
            int weeks = sobj.nextInt();
            int coins = sobj.nextInt();

            System.out.println(weeks * coins);
        }

        sobj.close();
    }
}