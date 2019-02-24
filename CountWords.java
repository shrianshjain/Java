
public class CountWords {

	public static int countWords(String str){
	
      int i,count=0;
      char[] str1 = str.toCharArray();
      for(i=0; i<str1.length; i++)
      {
        if(str1[i] == ' ')
          count++;
      }
      return count+1;
	}
}
