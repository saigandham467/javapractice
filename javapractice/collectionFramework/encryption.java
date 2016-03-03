package collectionFramework;
import java.io.*;

import java.util.Scanner;

public class encryption {
	public static void main(String args[]){

		Scanner sc =new Scanner(System.in);
		//System.out.println("");
		System.out.println("Enter the string");
		String str=sc.next();
		System.out.println("Enter the key");
		int key=sc.nextInt();
		StringBuilder sb = new StringBuilder(); 
		char[] letters = str.toCharArray(); 
		for (char ch : letters)
		 {
			 int temp=((int) ch);
			 temp -= 97;
			 temp += key;
			 temp %= 25;
			 temp += 97;
			 char c=(char)temp;
			 sb.append(c);
		 }
		 System.out.println("Encoded:"+sb.toString());
		 
		 	letters = sb.toString().toCharArray(); 
			StringBuilder sb2 = new StringBuilder(); 
		
			for (char ch : letters)
			 {
				 int temp=((int) ch);
				 temp -= 97;
				 temp -= key;
				 temp %= 25;
				 temp += 97;
				 char c=(char)temp;
				 sb2.append(c);
		}
			 System.out.println("Decoded:"+sb2.toString());

	}
}


	

