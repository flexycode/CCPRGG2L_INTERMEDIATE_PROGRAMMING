package Intermediate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExMatcherText {
 
	public static void main(String[] args)
	{
		 Pattern pat = Pattern.compile("NatioNAL UniverSity", Pattern.CASE_INSENSITIVE);
		 Matcher mat = pat.matcher("NationaL university");
		
		 boolean matchFound = mat.find();
		    if(matchFound) {
		      System.out.println("Match found in the pattern");
		    } else {
		      System.out.println("Match not found in the pattern");
		    }
	}
 
}
