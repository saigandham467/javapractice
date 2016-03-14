package collectionFramework;
import java.io.*;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("America");
		ll.add("India");
		ll.add("Africa");
		
		System.out.println("List ="+ll);
		
		Scanner sc=new Scanner(System.in);
		String element;
		int position,choice=0;
		while(choice<4){
			System.out.println();
			System.out.println("Linked list operations");
			System.out.println("1:add an element");
			System.out.println("2:Remove an element");
			System.out.println("3:change an element");
			System.out.println("4: Exit");
			
			System.out.print("Your choice");
			choice=Integer.parseInt(sc.next());
			switch(choice){
			case 1:System.out.println("enter an element");
				 element=sc.next();
				 System.out.println("At what position");
				 position=Integer.parseInt(sc.next());
				 ll.add(position-1, element);
				 break;
			case 2:System.out.println("enter the position");
			       position=Integer.parseInt(sc.next());
			       ll.remove(position-1);
			       break;
			case 3:System.out.println("enter position");
			       position=Integer.parseInt(sc.next());
			       System.out.println("enter new element");
			       element=sc.next();
			       ll.set(position-1, element);
			       break;
			       default:return;
			       
			       
			
			
			}
			System.out.print("List=");
			/*Iterator<String> it=ll.iterator();
			while(it.hasNext()){
				System.out.println("---------------------");
				System.out.print(it.next()+" ");
				System.out.println("---------------------");
			
			}*/
			System.out.println(ll);
			
			
		}
		
		

	}

}
