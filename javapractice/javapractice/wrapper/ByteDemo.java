package wrapper;
import java.io.*;
import java.util.Scanner;

public class ByteDemo {
	private static Scanner sc;

	public static void main(String[] args)throws IOException{
		sc = new Scanner(System.in);
		System.out.println("enter a byte no.");
		String s1=sc.next();
		Byte b1=new Byte(s1);
		System.out.print("enter a byte number:");
		String s2=sc.next();
		Byte b2=new Byte(s2);
		int n=b1.compareTo(b2);
		if(n==0)
			System.out.println("Both bytes are similar");
		else if(n<0)
			System.out.println(b1+"is less");
		else System.out.println(b2+"is less");
		
	}

}
