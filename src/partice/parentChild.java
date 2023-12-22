package partice;
class GrandFather
{
	int house=1,plots=1;
	
	public void setHouse(int house) {
		this.house = house;
	}
	
	public void setPlots(int plots) {
		this.plots = plots;
	}
	
}

 class Father extends GrandFather
{
	int house = 2;
	int plots = 2;
	
	Father()
	{
		
	}
	public int getHouse() {
		return house;
	}
	
	public void setHouse(int house) {
		this.house = house;
		
	}
	
	public int getPlots() {
		return plots;
	}
	
	public void setPlots(int plots) {
		this.plots = plots;
	}
}
 
 class Child extends Father
 {
	 int plots = 5 ;
	 
	 Child() 
	 {
	       System.out.print(super.getHouse());
	    }
	 
//	 @Override
//	 public int getPlots()
//	 {
//		return 5;
//		 
//	 }
	 
	 public int getPlots()
	 {
		 return 10;
	 }
	 
	 public int getPlots(int y)
	 {
		 return y+10;
	 }
	 public int getPlots(int y,int z)
	 {
		 return y+z;
	 }
	 
//	 public void setHouse
 }

public class parentChild {
	public static void main(String[] args)
	{
		Child c = new Child();
		
	    Father p = new Father();
	    
	    
	  /*  Father pc =(Father) new Child();
	    Child c1 = (Child)pc;
	    Father p1 = new Child();
	    Child c2 =(Child)p1;
	    
	    System.out.println(p.plots);
	    System.out.println(c1.plots);
	    System.out.println(c2.plots);
	    System.out.println(pc.getPlots());*/
	    
	  // Child cp = (Child) new Father();
	//   Child re =( Father)cp;
	   //System.out.println(c.plots);
	    
	    
	    
	    
	    
 
/*		Child cp = (Child) new Parent();
//		Parent pc = new Child();
		System.out.println(c.getHouse()+" "+c.getPlots()+" "+c.getPlots(9)+" "+c.getPlots(10, 11)+" "+c.house+" "+c.plots);
		Parent p = new Parent();
		System.out.println(p.house+" "+p.plots);
		
//		Child cp = (Child) new Parent();
		Parent pc = new Child();
		System.out.println(pc.house+" "+pc.plots+" "+pc.getPlots()+" "+pc.getHouse());
		
//		Child cp = (Parent) new Parent();
		Parent p1 = new Child();
		// do whatever
		Child c1 = (Child)p1;
		System.out.println(c1.house);*/
	}

}
