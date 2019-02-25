
public class PrintSubstring {

	public static void printSubstrings(String str){
	
      char[] str1 = str.toCharArray();
      int i,j;
      for(i=0;i<str1.length;i++)
      {
        for(j=i+1;j<=str1.length;j++)
          System.out.println(str.substring(i,j));
      }
	}
	

}