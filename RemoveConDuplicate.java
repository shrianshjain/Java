public class RemoveConDuplicate {

	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here
      char[] ch1 = input.toCharArray();
      int l=input.length();
      //char[] str = new char[99999];
      char[] ch2 = new char[l];
      char ch = ch1[0];
      int j=0;
      ch2[j] = ch;
     // System.out.println(ch1.length);
      for(int i=1;i<ch1.length;i++)
      {
        if(ch1[i]!=ch)
        {
          ch=ch1[i];
          j++;
        }
        ch2[j] = ch;
      }
      String string = new String(ch2);
      return string;
	}
}

/*
public class solution {

	public static String removeConsecutiveDuplicates(String input) {
	    char arr[]=input.toCharArray();
      String s="";
      int f=0;
      for(int i=0;i<arr.length-1;i++)
      {
       
          while(arr[i]==arr[i+1])
          {
            i++;
          if(i==arr.length-1)
          {
            break;
          }
          }
        s=s+arr[i];
      }
      if(arr[arr.length-1]!=arr[arr.length-2])
     s=s+arr[arr.length-1]; 
     return s;
	}
}*/