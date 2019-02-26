
public class LargestRowColumn {
	public static void findLargest(int input[][]){		
      int M = input.length,N = input[0].length;
      int i,j,sum1=0,max1=0,sum2=0,max2=0,row=0,column=0;
      for(i=0;i<M;i++)
      {
        sum1=0;
        for(j=0;j<N;j++)
          sum1+=input[i][j];
        if(sum1>max1)
        {
          max1=sum1;
          row=i;
        }
      }
      for(i=0;i<N;i++)
      {
        sum2=0;
        for(j=0;j<M;j++)
          sum2+=input[j][i];
        if(sum2>max2)
        {  
          max2=sum2;
          column=i;
        }
      }
      if(max1>=max2)
        System.out.print("row "+row+" "+max1);
      else
        System.out.print("column "+column+" "+max2);
	}

	
}
