import java.util.Scanner;

class SavingTaxes 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int T = sobj.nextInt();

        if(T < 1 || T > 100)
        {
            return;
        }

        for(int i = T ; i > 0; i--)
        {
            int X = sobj.nextInt();
            int Y = sobj.nextInt();

            System.out.println(X - Y);
        }

        sobj.close();
    }    
}
