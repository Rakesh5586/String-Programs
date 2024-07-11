package stringProgs;

public class CntVolAndConsStr {

	public static void main(String[] args) 
	{
		String s1 = "Sathya technologies Was established before you were born";
		String lc=s1.toLowerCase();
		int cv=0,cc=0;
		for(int i=0;i<lc.length();i++)
		{
			if(lc.charAt(i)=='a'||lc.charAt(i)=='e'||lc.charAt(i)=='i'
					||lc.charAt(i)=='o'||lc.charAt(i)=='u')
			{
				cv++;
			}
			else if(lc.charAt(i)>='a'&&lc.charAt(i)<='z')
			{
				cc++;
			}
		}
		System.out.println("Number of vowelsare: "+cv);
		System.out.println("number of consonents are: "+cc);
	}

}
