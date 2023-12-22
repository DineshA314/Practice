
public class hellowDiamond {
	public static void main(String [] args)
	{
		int n=5, space=n-1, a=1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<space; j++ )
			{
				System.out.print(" ");
			}
			space--;
			for(int j=1; j<=a; j++)
			{
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
		space=1;
		a-=4;
		for(int i=1; i<=n-1; i++)
		{
			for(int j=0; j<space; j++ )
			{
				System.out.print(" ");
			}
			space++;
			
				//System.out.println(a);
				for(int j=1; j<=a; j++)
				
			    {
					
					if((j==1)||(j==a))
					{
						System.out.print("*");
					}
					else
		
					{
						System.out.print(" ");
					}
				
			}
	
			System.out.println();
			a-=2;
			}
	
}
}