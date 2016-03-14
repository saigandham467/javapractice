package datastructures;



public class BstNode {
	

	
	
		//BstNode parent;
		//BstNode parent;
		BstNode left;
		BstNode right;
		int data;
		
		BstNode()
		{
			
			left =null;
			right=null;
			data = 0;
		}
		
		BstNode(int data)
		{
			left = null;
			right = null;
			this.data =data;
			
			
		}
		
		void setData(int data)
		{
			this.data=data;
		}
		
		int getData()
		{
			return data;
		}
		void setleft(BstNode left)
		{
			this.left=left;
		
		}
		void setright(BstNode right)
		{
			this.right=right;
		}
		BstNode getleft()
		{
			return left;
		}
		
		BstNode getright()
		{
			return right;
		}
		
		
	

}
