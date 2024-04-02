import java.util.*;
class SumArray
{
	public static void main(String arg[])
	{	
		Scanner ob= new Scanner(System.in);
		int a[]=new int[10],n,sum=0;
		System.out.println("Enter limit:");
		n=ob.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=ob.nextInt();
			sum=sum+a[i];
		}
		System.out.println("The Sum of array elements is "+sum);
	}
}
