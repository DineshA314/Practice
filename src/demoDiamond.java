import java.util.*;
public class demoDiamond {
public static void main(String[] args)
{
	Scanner in = new Scanner (System.in);
	System.out.print("Enter the odd num = ");
	int num = in.nextInt();
	int[][] dia = new int[num][num];
	int mid = num/2;
	
	for (int i = 0; i <= mid; i++) {
		dia[i][mid - i] = '*';
        dia[i][mid + i] = '*';
    }
	for (int i = mid + 1; i < num; i++) {
        dia[i][i - mid] = '*';
        dia[i][3 * mid - i] = '*';
    }
	for(int i=0; i< num; i++)
	{
		for(int j=0; j<num; j++)
		{
			if(dia[i][j]=='*')
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
}
}
