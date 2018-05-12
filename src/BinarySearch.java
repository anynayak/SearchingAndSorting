
public class BinarySearch {

	public int binarySearch(int[] T, int val)
	{
		int low=0,max=T.length;
		int mid=(low+max)/2;
		while(low<max)
		{
		 if(T[mid]==val) return mid;
		 else if (T[mid]> val) max=mid;
		 else low=mid;
		 
		 mid=(low+max)/2;
		}
		return -1;
	}
}
