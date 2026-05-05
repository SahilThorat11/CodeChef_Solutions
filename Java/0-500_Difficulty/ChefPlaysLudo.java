import java.util.Scanner;

class ChefPlaysLudo
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int T = sobj.nextInt();

        if(T < 1 || T > 6)
        {
            return;
        }

        for(int i = T; i >= 1; i--)
        {
            int X = sobj.nextInt();

            if(X < 1 || X > 6)
            {
                return;
            }

            if(X == 6)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

        sobj.close();
    }
}