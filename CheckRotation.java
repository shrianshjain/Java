public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
      int n = arr.length,count=0;
      for(int i=0;i<n-1;i++)
      {
       if(arr[i]>arr[i+1])
       {
         count=i+1;
         break;
       }
      }
      return count;
	}
}