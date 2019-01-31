import java.util.*;
class AverageMarks{
  public static void main(String args[])
  {
    int avg=0;
    int n[] = new int[10];
    Scanner sc = new Scanner(System.in);
    String ch = sc.next();
    for(int i=0;i<3;i++)
    n[i] = sc.nextInt();
    
    for(int i=0;i<3;i++)
    {
      avg+=n[i];
    }
    avg = avg/3;
    System.out.println(ch);
    System.out.println(avg);
  }
}
