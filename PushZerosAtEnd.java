public class PushZerosAtEnd {
	
	public static void pushZerosAtEnd(int[] arr){
      int n = arr.length;
      //int arr1[] = new int[n];
      int swap=0,i=0,j=0;
      while(i<n)
      {
        if(arr[i]!=0)
        {
          arr[j++] = arr[i];
        }
        i++;
      }
      while(j<n)
      {
        arr[j] = 0;
        j++;
      }
	}
}