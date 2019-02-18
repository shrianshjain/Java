public class ArrayRotate {	

	public static void rotate(int[] arr, int d) {
      int n = arr.length;
      int num;
      int arr1[] = new int[d];
      for(int i=0;i<d;i++)
        arr1[i] = arr[i];
        
      for(int i=0;i<d;i++)
        for(int j=0;j<n-1;j++)
        	arr[j] = arr[j+1];
      
      int j=0;
      for(int i=n-d;i<n;i++)
      {
        arr[i]=arr1[j];
        j++;
      }
        
	}
}