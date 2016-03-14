package files;

import java.io.*;

public class CreateFilesUsingBuffer {
	public static void main(String[] args) throws IOException{
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("my_file.txt",true);
		BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
		System.out.println("enter text(@ at the end):");
		char ch;
		long starttime=System.currentTimeMillis();
		while((ch=(char)dis.read())!='@')
			bout.write(ch);
		bout.close();
		long stoptime=System.currentTimeMillis();
		long elapsedtime=stoptime-starttime;
		System.out.println("total time="+elapsedtime);
	}

}
