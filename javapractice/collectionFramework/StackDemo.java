package collectionFramework;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
	 Stack<Integer> st=new Stack<Integer>();
	 int choice =0;
	 int position,element;
	 Scanner sc=new Scanner(System.in);
	 while(choice<4){
		 System.out.println("1:Push an element");
		 System.out.println("2:pop an element");
		 System.out.println("3:Search an element");
		 System.out.println("4:Exit");
		 System.out.println("Select your choice");
		 choice=Integer.parseInt(sc.next());
		 switch(choice){
		 case 1:System.out.println("enter an element");
		        element=Integer.parseInt(sc.next());
		        st.push(element);
		        break;
		 case 2: Integer obj=st.pop();
		 		 System.out.println("popped ="+obj);
		 		 break;
		 case 3:System.out.println("enter an element to search");
		        element=Integer.parseInt(sc.next());
		        position=st.search(element);
		        if(position==-1){
		        	System.out.println("Element not found");
		        	
		        }
		        else System.out.println("Position="+position);
		        break;
		        default:
		        	return;
		 }System.out.println("Stack contents :"+st);
		 
		 
		 
	 }
	 

	}

}
