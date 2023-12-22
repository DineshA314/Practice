class Box
{
	int l=2;
	int b=2;
	static int h=5;
	
	public int redBox()
	{
		blackBox();
		
		return l*b*h;
	}
	
	
	
	public static int blackBox()
	{
		int th=1;
		System.out.println(th);
		return 3;
	}
	
	public static void blueBox()
	{
		
		
		System.out.println("dinesh");
	}
			
	
}


public class staticMethod {
	
public static void main(String [] args)
{
	Box call1 = new Box();
	Box call2 = new Box();
 //   System.out.println (call1.blackBox());
  //  System.out.println (call2.blackBox());
	call1.blackBox();
	//call1.blueBox();
	//System.out.println("abi");
}
}
