
public class reverseRight {
	public static void main(String[] args) {
		int n= 4,space=0;
		
		for(int i=0 ; i<n; i++)
		{
			for(int j=n; j>space; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
		}
	}
}
