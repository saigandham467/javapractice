package files;

import java.io.*;
//import java.util.Scanner;

public class CreateFiles {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream dis=new DataInputStream(System.in);
		//Scanner sc=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("my_file.txt");
		System.out.println("enter text (@ at the end):");
		char ch;
		long starttime= System.currentTimeMillis();
		while((ch=(char)dis.read() )!='@')
			fout.write(ch);
		
			fout.close();
		long endtime=System.currentTimeMillis();
		long elapsedtime=endtime-starttime;
		System.out.println("program1Total time="+elapsedtime);
		

	 }
	
	
	
}
