package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class stack {
public static void main(String[] args)
{
	ArrayList st=new ArrayList();
	Scanner sc = new Scanner(System.in);
	while(true)
	{
	
	System.out.println("choose an operation");
	System.out.println("1:push");
	System.out.println("2:pop");
	System.out.println("3:size");
	System.out.println("4:exit");
	System.out.println("choose number");
	int number,input,output;
	
	
	number=sc.nextInt();
	switch(number)
	{
	
	case 1:System.out.println("enter number to enter");
			input=sc.nextInt();
			st.add(input);
			break;
	case 2:output=(int) st.get((st.size()-1));
			st.remove(st.size()-1);
			System.out.println(output);
			break;
	case 3:System.out.println(st.size());
			break;
	case 4: System.exit(0);
		
		
		
		
	}
	}
	
	
}
}
