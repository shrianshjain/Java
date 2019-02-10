public class LinearSearch{	
	
	public static int linearSearch(int[] arr, int num){
	
      for(int i=0;i<arr.length;i++)
      {
        if(num==arr[i])
        {
          return i;
        }
      }
		return -1;
	}
}