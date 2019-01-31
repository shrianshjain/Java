import java.util.*;
public class FartoCel {


	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int s = sc.nextInt();
      	int e = sc.nextInt();
      	int w = sc.nextInt();
      int i = s;
      int cel;
      while(i<=e)
      {
		cel = ((i-32) * 5/9);
        System.out.println(i+"	"+cel);
        i+=w;
      }
	}

}
