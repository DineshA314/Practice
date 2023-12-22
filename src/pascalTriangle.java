
public class pascalTriangle {
	public static void main(String [] args)
	{
		int n=4, space=n-1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<space; j++ )
			{
				System.out.print(" ");
			}
			space--;
			int a=1;
			for(int j=1; j<=i; j++)
			{
				System.out.print(a+" ");
				a = a * (i-j) / j;
			}
			System.out.println();
		}
		
		
}
	
}
