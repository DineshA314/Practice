
public class Diamond {
	public static void main(String [] args) {
		int n =6,p=n, space=1; 
		for(int i=1; i<=n; i++)
		{
		
			  for(int s=0;s<p-1; s++)
			  {
				  System.out.print(" ");
			  }
			  
			  p--;
			  
			  for(int j=0; j<space ; j++)
			  {
				  System.out.print("*");
			  }
			  space+=2;
			  System.out.println();
		  
	    }
		p=1;
		space-=4;
		for(int i=1; i<=n; i++)
		{
		
			  for(int s=0;s<p; s++)
			  {
				  System.out.print(" ");
			  }
			  
			  p++;
			  
			  for(int j=0; j<space ; j++)
			  {
				  System.out.print("*");
			  }
			  space-=2;
			  System.out.println();
		  
	    }
}
}
