import java.util.*;
public class EvenSum {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
      	int n =0;
      	n = sc.nextInt();
      	int sum=0;
      	for(int i=1;i<=n;i++)
        {
          if(i % 2 == 0)
            sum+=i;
        }
      System.out.print(sum);
		
	}

}
