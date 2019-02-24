
public class Palindrome {

	public static boolean checkPalindrome(String str){

      char[] str1 = str.toCharArray();
      char[] str2 = new char[str1.length];
      int j=0,count=0;
      for(int i=str1.length-1;i>=0;i--)
      {
        str2[j] = str1[i];
        j++;
      }
      for(int i=0;i<str2.length;i++)
      {
        if(str1[i]==str2[i])
        {
          count++;
        }
        else
          break;
      }
      if(count==str2.length)
        return true;
      else
        return false;
	}
}
