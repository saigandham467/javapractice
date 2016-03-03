package collectionFramework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args)throws IOException,NullPointerException {
		// TODO Auto-generated method stub
		ArrayList<String> AL=new ArrayList<String>();
		Scanner sc =new Scanner(System.in);
		int position,choice=0 ;
		String element;
		
		while(choice<11){
			System.out.println();
			System.out.println("1:add an element");
			System.out.println("2:add an element into particular position");
			System.out.println("3:remove an element");
			System.out.println("4:clear array list");
			System.out.println("5:replace an element");
			System.out.println("6:check an element is present");
			System.out.println("7:get an element");
			System.out.println("8:to get the position af an element");
			System.out.println("9:to get the last position of an element");
			System.out.println("10:get the size");
			System.out.println("11:to get object class array");
			System.out.println("enter the choice");
			//System.out.println("enter the choice");
			choice=sc.nextInt();
			switch(choice){
			case 1:	System.out.println("enter an element");
					element=sc.next();
					AL.add(element);
					break;
			case 2:	System.out.println("enter an element");	
					element=sc.next();
					System.out.println("enter position");
					position=sc.nextInt();
					AL.add(position-1, element);
					break;
			case 3: System.out.println("enter a position");
					position=sc.nextInt();
					System.out.println(AL.remove(position));
					break;
			case 4: System.out.println("press 1 to clear");
					if(sc.nextInt()==1);
					AL.clear();
					break;
			case 5: System.out.println("enter an element");
					element=sc.next();
					System.out.println("enter a position");
					position=sc.nextInt();
					System.out.println(AL.set(position, element));
					break;
			case 6:	System.out.println("enter an element");
					element=sc.next();
					System.out.println(AL.contains(element));
					break;
			case 7: System.out.println("enter a position");
					position=sc.nextInt();
					System.out.println(AL.get(position-1));
					break;
			case 8: System.out.println("enter an element");
					element=sc.next();
					System.out.println(AL.indexOf(element));
					break;
			case 10:System.out.println(AL.size());
			break;
			case 11:
				Object[] a = null;
				System.out.println(AL.toArray(a));
					
			 		
			}
			Iterator<String> it=AL.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
			
		}
	}

}
