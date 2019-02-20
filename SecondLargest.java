public class SecondLargest{	
	
	public static int secondLargestElement(int[] arr) {

      if(arr.length<=1)
        return -2147483648;
      else
      {
      int max=0;
      int hash[] = new int[99999],i=0;
      while(i<arr.length)
      {
        hash[arr[i]]++;
        if(arr[i]>max)
          max = arr[i];
        i++;
      }    
           for(i=max-1;i>=0;i--)
           {
             if(hash[i]>=1)
               return i ;
           }
        return Integer.MIN_VALUE;
      }
	}
}