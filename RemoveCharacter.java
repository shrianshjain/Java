public class RemoveCharacter {

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
      int count=0;
      char[] str = input.toCharArray();
      for(int i=0;i<str.length;i++)
        if(str[i]==c)
          count++;
      char[] ch = new char[str.length-count];
      int j=0;
      for(int i=0;i<str.length;i++)
      {
        if(str[i]!=c)
        {
          ch[j] = str[i];
      	  j++;
        }
      }
      String st = new String(ch);
      return st;
	}

}
