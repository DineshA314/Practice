import java.util.Scanner;
public class ka_3 {
public static void main(String[]args) {
	Scanner input = new Scanner (System.in);
	int num = input.nextInt();
	int s=0,p=0,a;
	a =num;
   while(num!=0) {
	  p = num%10;
	  s =s *10+p;
	  num/=10;
	  
   }
  
    
    System.out.println((a - s) );
	
}

}
