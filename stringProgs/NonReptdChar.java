package stringProgs;

public class NonReptdChar {
//to get first non-repeted character from string---
	public static void main(String[] args) 
	{
		String s1 = "Hello Hindi is me and yours national language";
		char ch;
		for(int i = 0;i<s1.length();i++)
		{
			ch = s1.charAt(i);
			if(s1.indexOf(ch)==s1.lastIndexOf(ch))
			{
				System.out.println(ch);
				break;
				
			}
		}

	}

}
