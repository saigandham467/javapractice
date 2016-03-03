package misc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		CharSequence number=sc.next();
		 Pattern testPattern= Pattern.compile("[A-z][A-Z0-9]*");
		 Matcher teststring= testPattern.matcher(number);

		if(!teststring.matches())
		{
		   System.out.println("blah blah!");
		}
		else
		{
			String temp="num("+number+")";
			System.out.println(temp);
		}

	}

}
