package networking;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;

public class Server1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(760);
		System.out.println("waiting for clients");
		Socket s=ss.accept();
		System.out.println("Connection established");
		OutputStream obj = s.getOutputStream();
		PrintStream ps =new PrintStream(obj);
		String str = "Hello Client";
		ps.println(str);
		ps.println("Bye");
		ps.close();
		ss.close();
		s.close();
		
	}

}
