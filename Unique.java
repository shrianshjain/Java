public class Unique{	
	
	public static int findUnique(int[] arr){
	int	max=0,num=0;
      
      for(int i=0;i<arr.length;i++)
      {
        if(max<arr[i])
          max=arr[i];
      }
      int hash[] = new int[max+1];
      for(int i=0;i<arr.length;i++)
      {
        hash[arr[i]]++;
      }
      for(int i=0;i<=max;i++)
        if(hash[i]==1)
          num=i;
      return num;
	}
}