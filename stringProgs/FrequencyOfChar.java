package stringProgs;

public class FrequencyOfChar {
//find the frequency of a--
	public void freQuency()
	{
		String s1 ="four hours of java daily will get me a job";
		char ch = 'a';
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{
	    	if(s1.charAt(i)==ch)
				{
					cnt++;
				}
		}
	System.out.println("Frequency of a is: "+cnt);
           
	}
	public static void main(String[] args) 
	{
		FrequencyOfChar ch = new FrequencyOfChar();
		   ch.freQuency();
	}
}
