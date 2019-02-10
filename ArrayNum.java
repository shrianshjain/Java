
public class ArrayNum{

	
	public static int[] arrange(int n){
		

     // Scanner sc = new Scanner(System.in);
      int arr[] = new int[n];
      
      int i=0,x=0,y=n-1;
      while(i<n)
      {
        i++;
        arr[x]=i;
        i++;
        if(i>n)
          break;
        arr[y]=i;
        x++;
        y--;
      }
      return arr;
	}
	
}
