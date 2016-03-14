package wrapper;
import java.io.*;
import java.util.Scanner;

public class CharTest {
	public static void main(String[] args)throws IOException{
		char ch;
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("Enter a character");
			ch=sc.next().trim().charAt(0);
			System.out.print("you entered: ");
			if(Character.isDigit(ch))
				System.out.println("a digit");
			else if(Character.isUpperCase(ch))
				System.out.println("an upper case letter");
			else if(Character.isLowerCase(ch))
				System.out.println("an lower case letter");
			else if(Character.isSpaceChar(ch))
				System.out.println("is space bar character");
			else if(Character.isWhitespace(ch)){
				System.out.println("is white space character");
			return;
		    }
		    //else System.out.println("Sorry i dont know that");
			
				
			
				
		}
		
	}
	

}
