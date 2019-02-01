import java.util.*;
  public class NumPattern2 {


	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sp=n-1;
      for(int i=1;i<=n;i++)
      {
        for(int j=0;j<sp;j++)
        {
          System.out.print(" ");
        }
        sp--;
        for(int k=0;k<i;k++)
        {
          System.out.print(k+i);
        }
          System.out.println();
      }
      
		
	}

}
