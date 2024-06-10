package JRegEx;
import java.util.Scanner;
import java.util.regex.*;
public class RegStudID {
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter your Student ID Number:");
			String StudNum = sc.nextLine();
			Pattern pat = Pattern.compile("^22-[0-9]{4}");
			Matcher mat = pat.matcher(StudNum);
			if(mat.matches()==true)
			{
				System.out.println("Student Number is Accepted");
			}
			else
			{
				System.out.println("Invalid student number");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
 
	}
 
}