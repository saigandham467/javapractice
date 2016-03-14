package datastructures;


public class Linkedlist {
	public static Linkedlistimpl list;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list = new Linkedlistimpl();
		/*
		System.out.println("--------------------------------");
		System.out.println( list.add(1));
		System.out.println( list.returncounter());
		System.out.println("--------------------------------");
		*/

		list.add("1",4);
		System.out.println("print list "+ list);
		/*
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		
		System.out.println("print list "+ list);
		System.out.println("print list size "+ list.size());
		System.out.println("get(3) "+ list.get(3));
		System.out.println("remove(2) "+ list.remove(2));
		System.out.println("size "+ list.size());
		System.out.println("print list"+ list);
		*/
		
	}
	
	
	
	

}
