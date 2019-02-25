
public class ReverseWordWise {
	public static String reverseWordWise(String input) {
      
      String[] temp = input.split("\\s");
      String result="";
      for(int i=0;i<temp.length;i++)
      {
        if(i==temp.length-1)
          result = temp[i] + result;
        else
          result = " " + temp[i] + result;
      }
      return result;
     // System.out.println(reverseWords(input));
	}
}
