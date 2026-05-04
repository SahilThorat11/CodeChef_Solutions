import java.util.Scanner;

class ClearDay
{
	public static void main (String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		int rainy = sobj.nextInt();
		int cloudy = sobj.nextInt();
		
		if(cloudy < 0 || cloudy > 7 || rainy < 0 || rainy > 7 || rainy + cloudy > 7)
		{
		    return;
		}
		
		System.out.println(7 - rainy - cloudy);
		
		sobj.close();
	}
}
