import java.util.*;
public class FibNum {


	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x=1,y=1,z=0;
      if(n<3 && n>0)
      {
        System.out.print("1");
      }
      else
      {
      	for(int i=0;i<n-2;i++)
      	{
       	  z=x+y;
          x=y;
          y=z;
      	}
        System.out.print(z);
      }
		
	}

}
