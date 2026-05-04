import java.util.Scanner;

class LuckySeven
{
	public static void main (String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		String str = new String();
		
		str = sobj.nextLine();
		
		if(str.length() != 10)
		{
		    return;
		} 
		
		for(int i = 0; i < str.length(); i++)
		{
		    char ch = str.charAt(i);
		    
		    if(ch < 'a' || ch > 'z')
		    {
		        return;
		    }
		}
		
		System.out.println(str.charAt(6));
	}
}
