
public class butterfly {
public static void main(String [] args)
{
	int n=14, space=n+n-2, a=1;
	
	for(int i=1; i<=n; i++)
	{
		for(int j=0; j<i; j++ )
		{
			System.out.print("*");
		}
		for(int s=0;s<space;s++)
		{
			System.out.print(" ");
		}
		space-=2;
		for(int j=0; j<i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	space=0;
	for(int i=n; i>=0; i--)
	{
		for(int j=0; j<i; j++ )
		{
			System.out.print("*");
		}
		for(int s=0;s<space;s++)
		{
			System.out.print(" ");
		}
		space+=2;
		for(int j=0; j<i; j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}	
	
}
}
