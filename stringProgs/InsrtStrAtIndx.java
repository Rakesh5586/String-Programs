package stringProgs;

public class InsrtStrAtIndx {
//Insert a string into another string at given index--- 5
	public static void main(String[] args) 
	{
		String s1 = "Java is Great";
		String s2 = "World ";
		String s3 = s1.substring(0,5)+s2+s1.substring(5);
		System.out.println(s3);

	}

}
