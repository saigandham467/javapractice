package collectionFramework;

import java.io.IOException;
//import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args)throws IOException{
		Vector<Integer> v = new Vector<Integer>();
		//Iterator<Integer> LI =new v.iterator();
		
		int X[]={22,33,44,55,66,77,88,99,44,55,6};
		for(int i=0;i<X.length;i++){
			v.add(X[i]);
			
		}
		System.out.println("Vector elements");
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
		System.out.println("retriving elements using Iteratorlist");
		
		ListIterator<Integer> LI=v.listIterator();
		
		System.out.println("In forward direction");
		while(LI.hasNext()){
			System.out.print(LI.next()+"\t");
		}
		System.out.println("In backword direction");
		while(LI.hasPrevious()){
			System.out.print(LI.previous()+"\t");
		}
		System.out.println("Capacity="+v.capacity());
		
		
	}

}
