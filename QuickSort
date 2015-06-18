
/**
 * Cormen's QuickSort Algorithm
 * @author mbhargava
 *
 */
public class QuickSort {
	
	
	public static void main(String[] args)
	{
		int arr[] = {3,2,1,4,7,6,5};
		quickSort(arr, 0, arr.length-1);
		System.out.println(arr);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
	}
	
	
	public static void quickSort(int[]arr, int p, int r)
	{
		if(p<r)
		{
			int q = partition(arr, p, r);
			quickSort(arr, p, q-1);
			quickSort(arr, q+1, r);
		}
		
	}
	
	public static int partition(int arr[], int p, int r)
	{
		int x = arr[r];
		int i = p - 1;
		for(int j = p; j <= r - 1; j++)
		{
			if(arr[j] <= x)
			{
				
				i++;
				int swap=arr[i];
				arr[i]=arr[j];
				arr[j]=swap;
			}
		}
		//swap
		int swap = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = swap;
		return i+1;
	}

}
