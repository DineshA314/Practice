import java.util.Scanner;
public class ka_5 {
public static void main(String [] args) {
	Scanner input = new Scanner (System.in);
	char c = input.next().charAt(0);
	
	for(int i=c ; i>=65; i--) {
		for(int j=65; j<=i;j++) {
			System.out.print((char)i);
		}
		System.out.println();
	}
	
}
}
