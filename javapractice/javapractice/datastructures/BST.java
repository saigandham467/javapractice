package datastructures;
import datastructures.BstNode;


public class BST 
{
	BstNode parent;
	BstNode root;
	
	
	void insert(int data)
	{
		if(root==null)
		{
			root= new BstNode(data);
			System.out.println(root.getData());
		}
		else
		{
		BstNode temp=root;
		while(temp!=null)
		{
			
			if (data < temp.getData())
			{
				if((temp.getleft())==null)
				{
					parent=temp;
				}
				temp=temp.getleft();
				
				
			}
			else 
			{
				if((temp.getright())==null)
				{
					parent=temp;
				}
				temp=temp.getright();
				
			}
		}
		    temp=new BstNode(data);
		    if(data<parent.getData())
		    {
		    	parent.setleft(temp);
		    }
		    else
		    {
		    	parent.setright(temp);
		    }
			
		
		}
		
	}
	void delete(int value)
	{
      BstNode temp =root;
      boolean key=true; 
      if(value==temp.getData())
      {
    	  System.out.println("in delete first if");
    	  key=false;
      }
      while(key&&temp!=null)
      {
    	  if(value==temp.getData())
    	  {
    		  key=false;
    	  }
    	  else if(value < temp.getData())
    	  {
    		  if(temp.getleft().getData()==value)
    		  {
    			  parent = temp;
    			  key = false;
    		  }
    		  temp=temp.getleft();
    	  }
    	  else if(value > temp.getData())
    	  {
    		  if(temp.getright().getData()==value)
    		  {
    			  parent = temp;
    			  key=false;
    		  }
    		  temp=temp.getright();
    	  }
    	  
    	
      }
      if(temp!=null)
      {
      if(temp.getleft()==null && temp.getright()==null)
      {
    	  System.out.println("in delete both childerns null");
    	  if(value==parent.getleft().getData())
    	  {
    		  System.out.println("in delete both childerns null parent.left");
    		  parent.left=null;
    		  
    	  }
    	  else
    	  {
    		  System.out.println("in delete both childerns null parent.right");
    		  parent.right=null;
    	  }
      }
      else if(temp.getleft()==null || temp.getright()==null)
      {
    	  System.out.println("in delete one childerns null");
    	  if(temp.getleft()==null)
    	  {
    		  System.out.println("in delete one childerns left = null");
    		  if(value==parent.getleft().getData())
    		  {
    			  System.out.println("in delete one childerns null parent.left=value");
    			  parent.left=temp.getright();
    		  }
    		  else
    		  {
    			  System.out.println("in delete one childerns null parent.right=value");
    			  parent.right=temp.getright();
    		  }
    	  }
    	  else 
    	  {
    		  System.out.println("in delete one childerns right = null");
    		  if(value==parent.getleft().getData())
    		  {
    			  System.out.println("in delete one childerns null parent.left=value");
    			  parent.left=temp.getleft();
    		  }
    		  else
    		  {
    			  System.out.println("in delete one childerns null parent.right=value");
    			  parent.right=temp.getleft();
    		  }
    		  
    		  
    	  }
      }
      else
      {
    	  
    	  System.out.println("in delete both childs not null");
    		
    	  BstNode itr=temp.getright();
    	  while(itr.getleft()!=null)
    		  itr=itr.getleft();
    	  itr.setleft(temp.getleft());
    	  if(value==root.getData())
    		  root=temp.getright();
    	  if(value==parent.getleft().getData())
    		  parent.setleft(temp.getright());
    	  else if(value==parent.getright().getData())
    		  parent.setright(temp.getright());
      }
	}
      
	}
	public void inorder()
	{
		inorder(root);
	}
	private void inorder(BstNode node)
	{
		if(node!=null)
		{
			inorder(node.getleft());
			System.out.println(node.getData());
			inorder(node.getright());
		}
	}
	
	
}
