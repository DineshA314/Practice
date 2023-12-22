
public class k_pattern {
public static void main(String [] args)
{
	int n=6, space=0; 
	
	for(int i=1; i<=n; i++)
	{
		for(int j=n; j>space; j-- )
		{
			System.out.print("*");
		}
		space++;
		System.out.println();
	}
	
	for(int i=2; i<=n; i++)
	{
		for(int j=1; j<=i; j++ )
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
}
}
