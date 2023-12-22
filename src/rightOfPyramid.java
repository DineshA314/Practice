
public class rightOfPyramid {
	public static void main(String[] args) {
		int n= 4,space=1;
		
		for(int i=0 ; i<n; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
		}
	}
}
