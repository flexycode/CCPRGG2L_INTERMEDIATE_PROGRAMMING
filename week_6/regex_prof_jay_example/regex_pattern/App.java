package JRegEx;
 
public class RegPattern {
 
	public static void main(String[] args)
	{
		String num1 = "^[0-9]+$";
		String num2 = "^2023+$";
		String word ="^a...e$";
		String word2 = "^J.r..n";
		
		System.out.println("112434" .matches(num1));
		System.out.println("apples" .matches(word));
		System.out.println("2024" .matches(num2));
		System.out.println("Jarnan" .matches(word2));
		
 
	}
 
}
 