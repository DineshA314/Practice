
public class ReverseNumber {
	public static void main(String [] args)
	{
		int n=4, space=0;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<space; j++ )
			{
				System.out.print(" ");
			}
			space++;

			for(int j=i; j<=n; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
}
}
