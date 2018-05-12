import java.util.Arrays;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;


class TestSorting {

	private BubbleSort bs=new BubbleSort();
	private SelectionSort st=new SelectionSort();
	private BinarySearch bn=new BinarySearch();
	private QuickSort qs=new QuickSort();
	private InsertionSort it=new InsertionSort();
	

	public void testBubleSort() {
		int[] temp=new int[] {1,2,4,3,5,7,6,8,9};
		temp=bs.sort(temp);
		System.out.println(Arrays.toString(temp));
	}
	 
	public void testSelectionSort()
	{
		int[] T =st.sort(new int[] {9,8,6,7,5,4,3,2,1});
		System.out.println(Arrays.toString(T));
	
	}
	@Test
	public void testInsertionSort()
	{
		int[] T =it.sort(new int[] {9,8,6,7,5,4,3,2,1});
		System.out.println("insertion sort "+Arrays.toString(T));
	
	}
	

	public void testQuickSort()
	{
		int[] T =qs.sort(new int[] {9,8,6,7,5,4,3,2,1});
		System.out.println(Arrays.toString(T));
	
	}
	
	
	public void testBinarySearch()
	{
		int[] T=new int[] {1, 2,3,4,5,6,7,8,9};
		int index=bn.binarySearch(T,7);
		Assert.assertEquals(6, index);
		index=bn.binarySearch(T,1);
		Assert.assertEquals(0, index);
	    index=bn.binarySearch(T,9);
		Assert.assertEquals(8, index);
	}
	
	

}
