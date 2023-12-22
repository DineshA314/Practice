
public class Zero_one_triangle {
	public static void main(String [] args) {
    int n= 4,space =1;
	
	for(int i=0 ; i<n; i++)
	{
		for(int j=0; j< space; j++)
		{
			if((j+i)%2==0)
			{
				System.out.print(1 + " ");
			}
			else
			{
				System.out.print(0 + " ");
			}
			
			
		}
		System.out.println();
		space++;
	}

}
}