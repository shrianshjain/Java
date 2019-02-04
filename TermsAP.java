import java.util.*;
public class TermsAP {	
	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
      int n;
      for(int i=1;i<=x;i++)
      {
        n=3*i+2;
        if(n%4==0)
        {
          x++;
        }
        else
          System.out.print(n+" ");
      }
	}
}
