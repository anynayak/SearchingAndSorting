import java.util.Arrays;

public class MergeSort {

	public int[]  sort(int[] T)
	{
		return mergerSort(T,0,T.length-1);
		
	}

	private int[] mergerSort(int[]T,int low,int max)
	{
	   
		int mid=(low+max)/2;
		while(low<max)
		{
			mergerSort(T,low,mid);
			mergerSort(T,mid+1,max);
			combine(T,low,mid,max);
		}
		return T;
	}

	private void combine(int[] T, int low,int mid,int max) 
	{
		int i=low,j=mid+1,k=low;
		int[] helper = new int[T.length];
		for (int y = low; y <= max; y++) {
			helper[y] = T[y];
		}			
		while(i<=mid && j<=max)
		{
			if(helper[i]<=helper[j]) {T[k]=helper[i];i++; }
			else {T[k]=helper[j];j++; }
			k++;
		}
			for(;i<mid;i++,k++)
			T[k]=helper[i];

			for(;j<max;j++,k++)
			T[k]=helper[j];
			
	}
	
	public static void main(String[] args) {
		int[] T=new int[] {1,2,3,4,5,6,7,8,9};
		MergeSort m=new MergeSort();
		m.sort(T);
		System.out.println(Arrays.toString(T));
	}
}
