import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(),x=1,flag=-1;
      System.out.println("2");
      for(int i=2;i<=n;i++)
      {
        for(int j=2;j<i;j++)
        {
          if(i%j==0)
          {
            flag=1;
            break;
          }
          else
            flag=0;
        }
        if(flag==0)
        	System.out.println(i);
      }
	}
}
