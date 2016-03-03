package networking;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;



public class Client1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket s = new Socket("local hosts",760);
		
		InputStream obj = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(obj));
		String str;
		while((str=br.readLine())!=null)
			System.out.println("From Server : "+ str);
		br.close();
		s.close();
		

	}

}
