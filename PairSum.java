public class PairSum{	
	
	public static void pairSum(int[] input, int x){
		
      for(int i=0;i<input.length;i++)
      {
        for(int j=i+1;j<input.length;j++)
        {
          if(input[i]+input[j]==x)
          {
            if(input[i]<input[j])
              System.out.println(input[i]+" "+input[j]);
            else
              System.out.println(input[j]+" "+input[i]);
          }
        }
      }
	}
}