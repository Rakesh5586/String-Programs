package stringProgs;

public class CntOfEvnWrdStr {
//Count the even number words in the Strings--
	public static void main(String[] args) 
	{
		String s1 = "monday is boring and time becones slow";
		  String str[] = s1.split(" ");
		  int cnt = 0;
		  for(int i=0;i<str.length;i++)
		  {
			  System.out.print(str[i].length()+" ");
			  if(str[i].length()%2==0)
			  {
				  cnt++;
			  }
		  }
		  System.out.println("\nThe even number words is:"+cnt);
	

	}

}
