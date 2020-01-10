package palindromeString;

public class Palindrome {

	public static boolean isPalindrome(String input)
	{
		if(input==null||input.isEmpty())
		{
			return false;
		}
		
		char[] arr = input.toCharArray(); 
		StringBuilder sb=new StringBuilder(input.length());
		
		for(int i=input.length()-1;i>=0;i--)
		{
			sb.append(arr[i]);
		}
		String reverse=sb.toString();
		return (reverse.equals(input));
	}
	public static void main(String[] args)
	{
		System.out.println(Palindrome.isPalindrome("malayalam"));
		System.out.println(Palindrome.isPalindrome("mathew"));
		System.out.println(Palindrome.isPalindrome("deepa"));
	}
}
