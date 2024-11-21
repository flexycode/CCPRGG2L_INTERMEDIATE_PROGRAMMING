package Intermediate;
import java.util.regex.*;  

public class RegExCharClass {
 
	public static void main(String[] args)
	{
		
		System.out.println(Pattern.matches("[abc]", "a"));//false (not a or b or c)  
		System.out.println(Pattern.matches("[abc]", "abc"));//false (among a or b or c)  
		System.out.println(Pattern.matches("[abc]", "abbbbc"));//false (a and a comes more than once)  
		
		
		System.out.println(Pattern.matches("[abc]?", "b"));//false (a comes more than one time)
		System.out.println(Pattern.matches("[abcx]+", "abcabacaaxaa"));//true (a or b or c once or more times)  
		System.out.println(Pattern.matches("[abc]+", "aaabbbbbb"));//true (a comes more than one time)  
		
	}
 
}