package networking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class FindingIP {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String site=sc.nextLine();
		try
		{
			InetAddress ip=InetAddress.getByName(site);
			System.out.println(" Ip address is :" + ip);
		}
		catch(UnknownHostException ue)
		{
			System.out.println(" website not found");
		}
		

	}

}
