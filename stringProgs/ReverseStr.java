package stringProgs;

public class ReverseStr {
	
	public static void main(String[] args)
	{
		String s1 = "Rakesh";
		String rev = "";
		for(int i = s1.length()-1;i>=0;i--)
		{
			rev = rev +s1.charAt(i);
		}
		System.out.println("Reversed String :"+rev);
		
	}

}
