import java.util.*;
class ReverseString
{
	public static void main(String arg[])
	{
	String org,rev="";
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter String:");
	org=ob.nextLine();
	int l=org.length();
	for(int i=l-1;i>=0;i--)
		{
		rev=rev+org.charAt(i);
		}
	System.out.println("Reverse of the String: "+rev);
	}
}
