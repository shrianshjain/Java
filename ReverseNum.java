import java.util.*;
public class ReverseNum {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int rev=0;
      while(n!=0)
      {
        int m;
        m=n%10;
        rev = rev*10+m;
        n/=10;
      }
      System.out.print(rev);
	}
}
