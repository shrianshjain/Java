
public class SwapAlter {	
	public static void swapAlternate(int[] input){
      int i=0,swap=0;
      while(i<input.length-1)
      {
        swap = input[i];
        input[i] = input[i+1]; 
        input[i+1] = swap;
        i+=2;
      }
	}
	
}
