package day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author adwived1
 *
 */
public class Regex {
	public static void main(String args[]) {
		
		
		//for phoneno
		
		String phno= "9323 9867123 122333";
		
		System.out.println();
		Pattern p =Pattern.compile("(\\d{4})\\s{1}(\\d{7})\\s{1}(\\d{6})");
		Matcher m =  p.matcher(phno);
		
		System.out.println(m.matches());
		System.out.println(m.group());
		System.out.println(m.group(2));
		
		//for characters
		
		 boolean n=  Pattern.matches("[0-9]{10}", "932356852");
		 System.out.println(n);
		 
		 // flyingreturn.base@airindia.in
		 
		 
		 
	}

}
