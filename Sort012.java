public class Sort012{	

	public static void sort012(int[] arr){
      int n = arr.length,count0=0,count1=0,count2=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==0)
          count0++;
        else if(arr[i]==1)
          count1++;
        else
          count2++;
      }
      int i=0;
      while(i<n)
      {
        if(i<count0)
          arr[i]=0;
        else
          if(i>=count0 && i<count0+count1)
            arr[i] = 1;
        else
            arr[i]=2;
        i++;
      }
      
	}
}