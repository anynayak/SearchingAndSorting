public class SelectionSort {


	public int[] sort(int[] T)
	{
		for(int i=0;i<T.length;i++)
		{
			for(int j=i+1;j<T.length;j++)
			{
				if(T[j]<T[i])
				{
				T[i]=T[i]+T[j];
				T[j]=T[i]-T[j];
				T[i]=T[i]-T[j];
				}
			}
		}
		
		return T;
	}
}
