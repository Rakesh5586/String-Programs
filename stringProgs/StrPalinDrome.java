package stringProgs;
import java.util.Scanner;
public class StrPalinDrome {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1 = s.next();
		String rev = "";
          for(int i=s1.length()-1;i>=0;i--)
          {
        	  rev = rev + s1.charAt(i);
          }
         if(s1.equals(rev))
         {
        	 System.out.println("String is palindrome");
         }
         else
         {
        	 System.out.println("String not palindrome");
         }
	}

}
