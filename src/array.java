import java.util.*;
public class array {
public static void main(String [] args)
{
	Scanner in = new Scanner (System.in);
	
	//int[] name = new int [10];
	//int [][][] a = {{{1,2,3,4},{5,6,7}},{{2}}};
	//System.out.println(a.length);
/*	for(int i=0; i<name.length; i++)
	{
		name[i] = i;
		System.out.println(name[i]);
	}*/
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
