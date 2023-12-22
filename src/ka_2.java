import java.util.Scanner;
public class ka_2 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	char c = input.next().charAt(0);
	
	for(int i=c;i<=90;i++) {
		System.out.print((char)i);
	}
	}
}
