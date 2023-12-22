
public class NumberReversePyamid {
	public static void main(String[] args) {
		
		int n= 4,space=n;
		
		for(int i=0 ; i<n; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			space--;
		}
	}
}
