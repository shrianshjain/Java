public class BinarySearch{	
	public static int binarySearch(int[] arr, int num){
      int up=0,down=arr.length-1,mid=0;
      while(up<=down)
      {
        mid = up+(down-up)/2;
       if(arr[mid]==num)
         return mid;
        else if(arr[mid]<num)
          up = mid+1;
        else
          down = mid-1;
      } 
      return -1;
	}
}