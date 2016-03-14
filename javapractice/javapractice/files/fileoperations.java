package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class fileoperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("type-error1.tl"));
		String line;
		while((line=br.readLine())!=null)
		{
			//System.out.println(line);
		StringTokenizer st=new StringTokenizer(line);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
}