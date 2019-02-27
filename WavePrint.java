
public class WavePrint {
	
	public static void wavePrint(int input[][]){
		
      int M = input.length,N = input[0].length,i,j=0;
      i=0;
      while(i<N)
      {
        j=0;
        while(j<M)
        {
          System.out.print(input[j][i]+" ");
            j++;
        }
        i++;
        j=input.length-1;
        while(j>=0)
        {
          System.out.print(input[j][i]+" ");
          j--;
        }
        i++;      
      }
	}

	
}
