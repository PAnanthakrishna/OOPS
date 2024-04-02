import java.util.*;
class Prime
{
	public static void main(String arg[])
	{
		Scanner ob =new Scanner(System.in);
		int a,flag=0;
		System.out.println("Enter a number:");
		a=ob.nextInt();
		
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
		System.out.println("Not a prime number");
		}
		else
		{
		System.out.println("Is a prime number");
		}
	}
}
