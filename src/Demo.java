import java.util.*;
public class Demo {
	
public static void main(String[] args)
{
	int[]arr = {5,3,2,4,6};
	
	System.out.print(Arrays.toString(arr));
	mergeSort(arr,0, arr.length-1);
	System.out.print(Arrays.toString(arr));
}
public static void mergeSort(int[] arr, int left,int right)
{
	if(left >= right)
		return;
	
	int mid = left + (right-left)/2;
	
	mergeSort(arr,left,mid);
	mergeSort(arr,mid+1,right);
	
	int leftArraySta = left;
	int rightArraySta = mid+1;
	
	int[] leftArray = new int[mid - left + 1];
	int[] rightArray = new int [right - mid];
	
	for(int i=0; i<leftArray.length; i++)
	{
		leftArray[i] = arr[leftArraySta + i];
	}
	for(int i=0; i<rightArray.length; i++)
	{
		rightArray[i] = arr[rightArraySta + i];
	}
	
	int index = left;
	int p1= 0;
	int p2 = 0;
	
	while( p1 < leftArray.length && p2 < rightArray.length  )
	{
		if(leftArray[p1] <= rightArray[p2])
		{
			arr[index++] = leftArray[p1++];
		}
		else
		{
			arr[index++] = rightArray[p2++];
		}
	}
	
	while(p1 < leftArray.length)
	{
		arr[index++] = leftArray[p1++];
	}
	
	while(p2 < rightArray.length)
	{
		arr[index++] = rightArray[p2++];
	}
}
}
