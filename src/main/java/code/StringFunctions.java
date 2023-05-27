package code;

public class StringFunctions {

	
	public static boolean isPalindrome(String str)
	{
		
		String result=null;
		boolean flag=false;
		
		for(int i = str.length() -1; i>=0;i--)
		{
			result = result+ str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(result))
		{
			flag=false;
		}
		return flag;
	}
}
