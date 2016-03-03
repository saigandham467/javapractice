package collectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable <String, Integer> ht=new Hashtable <String, Integer>();
		ht.put("Ajay", 50);
		ht.put("Sai", 100);
		ht.put("sachin", 150);
		ht.put("Gavaskar", 120);
		System.out.println("The player names :");
		Enumeration e=ht.keys();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter player");
		String name=sc.next();
		name=name.trim();
		Integer score=ht.get(name);
		if(score!=null){
			int sco=score.intValue();
			System.out.println(name+"scored"+sco);
			
		}
		else System.out.println("player not found");
	    
	}

}
