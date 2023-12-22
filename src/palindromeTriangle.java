
public class palindromeTriangle {
	public static void main(String [] args) {
		  int n =9,p=n, space=2; 
		for(int i=1; i<=n; i++)
		{
		
			  for(int s=0;s<p-1; s++)
			  {
				  System.out.print(" ");
			  }
			  p--;
			 
			  for(int j=i; j>=1 ; j--)
			  {
				  System.out.print(j);
			  }
			  for(int j=2; j<space; j++) 
			  {
				  System.out.print(j);
			  }
			  space++;
			  System.out.println();
		  
	    }
		  
}
}
