
/**
 * Implementation of merge sort algorithm as described in Cormen(CLRS)
 * @author mbhargava
 *
 */
public class MergeSort {
	
	public static void main(String args[])
	{
		int[] arr = {2,4,8,3,5,9,1
				};
		System.out.println(arr);
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(arr);
	}
	
	private static void mergeSort(int[] arr, int p, int r)
	{
		if(p < r)
		{
			int q = (p+r)/2;
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);
			merge(arr, p, q, r);
			
		}
	}
	
	
	/**
	 * Merge function
	 * @param arr, original array
	 * @param p, start index of first array
	 * @param q, end index of first array
	 * @param r, end index of array arr
	 */
	public static void merge(int[] arr, int p, int q, int r)
	{
		final int n1 = q - p + 1;
		final int n2 = r - q;
		final int[]left = new int[n1+1];
		final int[]right = new int[n2+1];
		for(int i = 0; i < n1; i++)
		{
			left[i] = arr[p+i];
		}
		
		for(int i = 0; i < n2; i++)
		{
			right[i] = arr[q+i+1];
		}
		
		left[n1]  = Integer.MAX_VALUE;
		right[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for(int k = p; k <= r;k++)
		{
			if(left[i] <= right[j])
			{
				arr[k] = left[i++];
			}
			else
			{
				arr[k] = right[j++];
			}
		}
	}
	

}
