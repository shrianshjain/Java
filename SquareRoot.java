import java.util.*;
public class Main {
	
	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt(),result=1,i=1;
      while(result<=n)
      {
        i++;
        result = i*i;
      }
        System.out.print(i-1);
	}
}
