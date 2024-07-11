package stringProgs;

public class NumOfWrdsStr {

	//find the number of words in a string--- WORDS = 7.
	public static void main(String[] args)
	{
		String s1 = "monday is boring and time becones slow";
		String ar[] = s1.split(" ");
		 System.out.println("the number of words are:"+ar.length);
		 
		              // OR
		 
		 System.out.println("Words are:"+s1.split(" ").length);
		 
		              //OR
		 
		 String str[] = s1.split(" ");
		 int cnt =0;
		 for(String s :str)
		 {
			 cnt++;
		 }
		   System.out.println("count of words in string is:"+cnt); 

	}

}
