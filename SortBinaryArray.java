public class SortBinaryArray{	
	public static void sortBinaryArray(int[] arr){
      int j=0;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==0)
          j++;
      }
      for(int i=0;i<j;i++)
      {
        arr[i]=0;
      }
      for(int i=j;i<arr.length;i++)
      {
        arr[i]=1;
      }

	}
}