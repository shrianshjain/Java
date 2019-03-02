public class Permutation {

	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
      char[] ch1 = input1.toCharArray();
      char[] ch2 = input2.toCharArray();
      char[] str = new char[256];
      int count=0;
      for(int i=0;i<ch1.length;i++)
      {
        str[ch1[i]]++;
        str[ch2[i]]--;
      }
      for(int i=0;i<256;i++)
      {
        if(str[i]>0)
          break;
        else
          count++;
      }
      if(count==256)
        return true;
      else
        return false;
	}
}
