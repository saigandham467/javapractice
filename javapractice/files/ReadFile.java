package files;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("my_file.txt");
			System.out.println("File Contents:");
			int ch;
			while((ch=fis.read())!=-1)
				System.out.print((char)ch);
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("exception:"+e);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
