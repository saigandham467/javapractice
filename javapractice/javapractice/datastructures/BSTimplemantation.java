package datastructures;

import java.util.Scanner;

public class BSTimplemantation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BST bstobj = new BST();
		int choice,value;
		while(true)
		{
		System.out.println("enter your choice");
        System.out.println("1 to insert");
        System.out.println("2 to delete");
        System.out.println("3 to inorder");
        choice = sc.nextInt();
        switch(choice)
        {
        case 1:
        	System.out.println("enter the value to insert");
        	value=sc.nextInt();
        	bstobj.insert(value);
        	if(bstobj.root.getright()!=null)
        	System.out.println(bstobj.root.getright().getData());
        	break;
        case 2:
        	System.out.println("enter the value to delete");
        	value=sc.nextInt();
        	bstobj.delete(value);
        	break;
        case 3:
        	System.out.println("inorder print is");
        	bstobj.inorder();
        	break;
        	
        
        }
        
     }
     
		
	}

}
