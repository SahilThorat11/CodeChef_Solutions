import java.util.Scanner;

class MasterchefFinals
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int T = sobj.nextInt();

        for(int i = T; i >= 1; i--)
        {
            int X = sobj.nextInt();

            if(X < 1 || X > 10)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }

        sobj.close();
    }
}