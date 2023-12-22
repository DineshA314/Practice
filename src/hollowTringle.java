
public class hollowTringle {
	public static void main(String [] args)
	{
		int n=5, space=n, a=1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<space; j++ )
			{
				System.out.print(" ");
			}
			space--;
			for(int j=1; j<=a; j++)
			{
				if(i==n)
				{
					for(int s=0; s<n; s++)
					{
						System.out.print("* ");
					}
					break;
				}
				if((j==1)||(j==a))
				{
					System.out.print("*");
				}else
	
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			a+=2;
		}
}
}