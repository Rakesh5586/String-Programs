package stringProgs;

public class DuplicateCharStr {

	public static void main(String[] args) 
	{
		String s1 = "mathematics";
		int ar[] = new int[256];
		int n;
		for(int i=0;i<s1.length();i++)
		{
			n = s1.charAt(i);
			ar[n] = ar[n] +1;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>1)
			{
				System.out.println((char)i);
			}
		}

	}

}
