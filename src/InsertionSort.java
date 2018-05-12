
public class InsertionSort {

	public  int[] sort(int [] T)
	{
		for(int i=1;i<T.length;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(T[j]>T[j+1])
				{
					int temp=T[j+1];
					T[j+1]=T[j];
					T[j]=temp;
				}
			}
		}
		return T;
	}
}
