
public class NumbertTriangular {
public static void main(String [] args) {
	int n = 9, space= 1 , p;
	p = n;
	
	for(int i=1; i<=n; i++)
	{
		for(int j=0; j<p-1; j++)
		{
			System.out.print(" ");	
		}
		
		for(int s=1; s <= space ; s++ )
		{
			System.out.print(i +" ");
		}
		System.out.println();
		p--;
		space++;
	}
}
}
