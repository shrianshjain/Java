import java.util.*;
public class StarPattern {


	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(),sp=n-1,st=1;
      for(int i=0;i<n;i++)
      {
        int j=0;
        while(j<sp)
        {
          System.out.print(" ");
          j++;      
        }
        sp--;
        for(int k=0;k<st;k++)
          System.out.print("*");
        st+=2;
        System.out.println();
      }
		
	}

}
