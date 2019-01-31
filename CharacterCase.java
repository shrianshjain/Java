import java.util.*; 
public class CharacterCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
      	char str = sc.next().charAt(0);
      
      	if((str >= 65) && (str <= 91))
          System.out.print("1");
      	else if((str >= 97) && (str <= 123))
          System.out.print("0");
      	else
          System.out.print("-1");
	}
}
