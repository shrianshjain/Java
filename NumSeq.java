import java.util.*;
public class NumSeq {
	
	public static void main(String[] args) {
      int arr[] = new int[100];
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x=1,i,j,k;
      int flag=0;
      for(i=0;i<n;i++)
      {
        arr[i] = sc.nextInt();
      }
      for(i=0;i<n-1;i++)
      {
        if(arr[i]<arr[i+1])
        {
          //flag = "true";
          break;
        }
      }
      for(j=i+1;j<n-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          flag = 1;
        } 
      }
      if(flag==1)
        System.out.print("false");
      else
        System.out.print("true");
	}
}
