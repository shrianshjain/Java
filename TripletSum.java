public class TripletSum{	

	public static void tripletSum(int[] input, int x){
		
		int swap=0;
      for(int i=0;i<input.length;i++)
      {
        for(int j=0;j<input.length-i-1;j++)
        {
          if(input[j]>input[j+1])
          {
            swap=input[j];
            input[j]=input[j+1];
            input[j+1]=swap;
          }
        }
      }
      
      
      for(int i=0;i<input.length-2;i++)
        {
          for(int j=i+1;j<input.length-1;j++)
          {
            for(int k=j+1;k<input.length;k++)
            {
              if((input[i]+input[j]+input[k])==x)
              {
                  System.out.println(input[i]+" "+input[j]+" "+input[k]);
              }
            }
          }
        }
	}
}
