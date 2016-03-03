package collectionFramework;

import java.io.IOException;
import java.util.*;

public class HashmapDemo {
	public static void main(String[] args)throws IOException {
		HashMap<String, Long> hm=new HashMap<String,Long>();
		String name;
		Long phno;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println();
			System.out.println("1:enter phone entries");
			System.out.println("2:Look up in the book");
			System.out.println("3:Display names in the book");
			System.out.println("4:Exit");
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			switch(choice){
			case 1:	System.out.println("enter name");
					name=sc.next();
					System.out.println("enter phone number");
					phno=sc.nextLong();
					hm.put(name, phno);
					break;
			case 2:	System.out.println("enter name");	
					name=sc.next();
					name=name.trim();
					phno=hm.get(name);
					System.out.println("phno="+phno);
					break;
			case 3: Set<String> set=new HashSet<String>();
					set=hm.keySet();
					System.out.println("Set="+set);
					break;
			case 4:Collection<Long> col=new HashSet<Long>();
					col=hm.values();
					System.out.println("Values="+col);
			case 5:return;
			
			 		
			}
			
			
			
		}
		
	}
}


