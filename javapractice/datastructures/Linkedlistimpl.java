package datastructures;



public class Linkedlistimpl {
	
	int counter ;
	Node head;
	
	
	/*
	Linkedlistimpl()
	{
		
	}
	*/
	
	
	public Node returnhead()
	{
		return head;
	}
	public int returncounter()
	{
		return counter;
	}
	
	
	public Node add(Object data)
	{
		if(head==null)
		{
			head = new Node(data);
			return head;
		}
		Node temp=new Node(data);
		Node current = head;
		
		if(current !=null)
		{
			while(current.getNext()!=null)
			{
				current = current.getNext();
			}
		}
		current.setNext(temp);
		counter++;
		return head;
		
	}
	public void add(Object data,int index)
	{
		
		Node temp=new Node(data);
		Node current = head;
		if(current!=null)
		{
			for(int i=1;i<index&&current.getNext()!=null;i++)
			{
				current=current.getNext();
			}
			
		
		temp.setNext(current.getNext());
		current.setNext(temp);
		counter++;
		}
		else 
		{
			current =null;
		}
	}
	public Object get(int index)
	{
		if(index <0)
			return null;
		Node current = null;
		if(head != null)
		{
			current = head.getNext();
			for (int i=0; i<index ; i++)
			{
				if(current.getNext()==null)
					return null;
				current = current.getNext();
			}
			return current.getData();
		}
		
		return current;
		
	}
	public boolean remove(int index)
	{
		if(index < 1 || index > counter)
		{
			return false;
		}
		Node current = head;
		if(head != null)
		{
			for(int i=0; i<index;i++)
			{
				if(current.getNext()==null)
					return false;
				current = current.getNext();
				
		    
			}
		current.setNext(current.getNext().getNext());
		counter = counter -1;
		return true;
		}
		return false;
		
	}
	public int size()
	{
		return counter;
	}
	public String toString()
	{
		String out =" ";
		if(head != null)
		{
			Node current=head.getNext();
			while(current != null)
			{
				out= out + "[" + current.getData().toString() + "]";
				current = current.getNext();
			}
		}
			
		return out;
		
	}
	
	

	
	
	
	
	
	
	
	private class Node
	{
		Node next;
		Object data;
		
		
		Node(Object datavalue)
		{
			next = null;
			data = datavalue;
			
		}
		
		Node(Object datavalue,Node nextvalue)
		{
			data = datavalue;
			next = nextvalue;
		}
		public void setData(Object datavalue)
		{
			data = datavalue;
			
		}
		public void setNext(Node nextvalue)
		{
			next=nextvalue;
			
		}
		public Node getNext()
		{
			return next;
		}
		public Object getData()
		{
			return data;
		}
	}
}
