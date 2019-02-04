import java.util.*;
public class SumOrPro {
	
	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int sum = 0,pro = 1;
      if(m==1)
      {
        for(int i=1;i<=n;i++)
        {
          sum+=i;
        }
        System.out.print(sum);
      }
      else if(m==2)
      {
       for(int i=1;i<=n;i++)
        {
          pro*=i;
        }
        System.out.print(pro); 
      }
      else
        System.out.print("-1");
	}
}
