
public class leftHalfPyramid {
	public static void main(String[] args) {
		int n= 4,space=n;
		
		for(int i=1 ; i<=n; i++)
		{
			for(int j=0; j<space; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
		}
	}
}
