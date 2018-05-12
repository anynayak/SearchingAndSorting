
public class QuickSort {

	public int[] sort(int[] T)
	{
		quickSort(T,0,T.length-1);
		
		return T;
	}
	
	private void quickSort(int[] T, int low,int max)
	{
		while(low<max)
		{
		int pivot=findPivot(T,low,max);
		//quickSort(T, low, pivot-1);
		quickSort(T, pivot+1, max);
		}
	}

	private int findPivot(int[] T, int low, int max) {
		int mid=(low+max)/2;
		while(low<max)
		{
			if(T[mid]>T[low]) low++;
			if(T[mid]<T[max]) max--;
			if(T[mid]<T[low] && T[mid]>T[max])
			{
				int temp=T[low];
				T[low]=T[max];
				T[max]=temp;
				low++;
				max--;
			}
			
		}
		
		return mid;
	}
}
