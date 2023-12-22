
public class MirrorImage {
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
		space-=2;
		for(int i=3; i>0; i--)
		{
			for(int j=0; j<space; j++ )
			{
				System.out.print(" ");
			}
			space--;

			for(int j=i; j<=n; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
}
}
