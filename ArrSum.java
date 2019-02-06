import java.util.*;
public class ArrSum {

	public static int sum(int[] input){
		Scanner sc = new Scanner(System.in);
      int sum=0;
      for(int i=0; i<input.length;i++)
      {
        sum+=input[i];
      }
      return sum;

	}
	
}