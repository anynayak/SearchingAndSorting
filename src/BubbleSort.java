
public class BubbleSort {

	public int[] sort(int[] T)
	{
		for(int i=0;i<T.length-1;i++)
		{
			for(int j=i;j<T.length-1;j++)
			if(T[j]>T[j+1])
			{
				T[j]=T[j]+T[j+1];
				T[j+1]=T[j]-T[j+1];
				T[j]=T[j]-T[j+1];
			}
		}
		
		return T;
	}
}
