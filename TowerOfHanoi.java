import java.util.*;
public class TowerOfHanoi{
	public static void main(String args[])
	{
		toh("A","B","C",3);
	}
	public static void toh(String S,String D,String A,int n)
	{
		if(n<1)
		   return;
		toh(S,A,D,n-1);
		System.out.println("Move "+S+"->"+D+" "+n);
		toh(A,D,S,n-1);
	}
}