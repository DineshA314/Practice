
public class HollowHourClass {
	public static void main(String [] args)
	{
		int n=6, space=0, a=n+n-3;
		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<space; j++ )
			{
				System.out.print(" ");
			}
			space++;
			if(i==1)
			{
				for(int s=0; s<n; s++)
				{
					System.out.print("* ");
				}
	 			System.out.println();
				
			}
			
			else
			{
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
		space=n-2;
		a=3;
		for(int i=1; i<n; i++)
		{
			for(int j=0; j<space; j++ )
			{
				System.out.print(" ");
			}
			space--;
			for(int j=1; j<=a; j++)
			{
				if(i==n-1)
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

