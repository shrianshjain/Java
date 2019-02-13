public class Duplicate{	
	
	public static int duplicate(int[] arr){
		int num=0;
      for(int i=0;i<arr.length;i++)
      {
        for(int j=i+1;j<arr.length;j++)
        {
          if(arr[i]==arr[j])
            num=arr[i];
        }
      }
      return num;
	}
}