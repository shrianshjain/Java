import java.util.*;
public class RowWiseSum {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int M = sc.nextInt(),N = sc.nextInt();
      int Arr[][] = new int[M][N];
      for(int i=0;i<M;i++)
      {
        for(int j=0;j<N;j++)
        {
          Arr[i][j] = sc.nextInt();
        }
      }
      for(int i=0;i<M;i++)
      {
        int sum=0;
        for(int j=0;j<N;j++)
        {
          sum += Arr[i][j];
        }
        System.out.print(sum+" ");
      }
	}
}
