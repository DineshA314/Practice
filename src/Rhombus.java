
public class Rhombus {
	public static void main(String [] args) {
	    int n= 5,space =0;
	    
	    for(int i=0; i<n; i++)
	    {
	    	for(int j=0; j<space; j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(int j=0; j<4; j++ )
	    	{
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    	space++;
	    }
	    
	}
}
