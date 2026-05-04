import java.util.Scanner;

class DoubleRent 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int rent = sobj.nextInt();

        if(rent <= 0 || rent > 10)
        {
            return;
        }

        System.out.println(rent * 2);

        sobj.close();
    }
}
