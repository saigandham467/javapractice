package KMeans;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class kmeans 
{
	public static void main(String[] args)
	{ 
		
		Random rand=new Random();
		System.out.println("enter the number of points");
		Scanner sc=new Scanner(System.in);
		int points=sc.nextInt();
		System.out.println("enter the number of clusters you want");
		int k=sc.nextInt();
		int arr[][]=new int[points][2];
	    System.out.println("enter the X, Y values");//for loop to take x,y values
		for(int rows=0;rows<points;rows++)
		{
			for(int col=0;col<2;col++)
			{
				if(col==0) 
				{
					System.out.println("enter X value");
					arr[rows][col]=sc.nextInt();
				}
				else 
				{
					System.out.println("enter y value");
					arr[rows][col]=sc.nextInt();
				}
			}
		}
		//here i generated random number and selected k points randomly as centroids
		double centroid[][]=new double[k][2];
		ArrayList<Integer> temp=new ArrayList<Integer>(k);
		while(temp.size()<k)
		{
			int random=rand.nextInt(points);
			if(!temp.contains(random))
			{
				temp.add(random);
			}
		}
	
		for(int i=0;i<k;i++)
		{
			centroid[i][0]=arr[temp.get(i)][0];
			centroid[i][1]=arr[temp.get(i)][1];
		}
		methodcalculate(k,points,arr,centroid);
		}
	/**
	 * This method calculates the distances between centroid and points forms clusters. and updates these values repeatedly until final iteration
	 * @param k is number of cluster value
	 * @param points represent total number of points
	 * @param arr is an array with all input values
	 * @param centroid is an array with centroid values
	 */
	public static void methodcalculate(int k,int points,int arr[][],double centroid[][])
	{
     int cluster[][][]=new int[k][points][2]; 
     double tempcentroid[][]=new double[k][2];
		double value[]=new double[k];
		for(int i=0;i<points;i++)
		{
			for(int j=0;j<k;j++)
			{
				value[j]=Math.sqrt((Math.pow(centroid[j][0]-arr[i][0],2))+Math.pow(centroid[j][1]-arr[i][1],2));
			}
			int min=0;
			double minvalue=value[0];
			for(int j=0;j<k;j++)
			{   
				if(value[j]<minvalue)
				{
					minvalue=value[j];
					min =j;
				}
			}
			cluster[min][i][0]=arr[i][0];
			cluster[min][i][1]=arr[i][1];
		}
		
		
		for(int i=0;i<k;i++)
		{
			for(int x=0;x<2;x++)
			{ 
				double centroidcountx=0;
				double centroidcounty=0;
				int count=0;
				for(int j=0;j<points;j++)
				{
					if(x==0)
					{
					  if(cluster[i][j][0]>0||cluster[i][j][1]>0)
					    {
						centroidcountx=centroidcountx+cluster[i][j][0];
						count=count+1;
					    }
					}
					if(x==1)
					{
						if(cluster[i][j][0]>0||cluster[i][j][1]>0)
						{
							centroidcounty=centroidcounty+cluster[i][j][1];
							count=count+1;
						}
					}
			    }
				if(x==0)
				{
				   tempcentroid[i][x]=(centroidcountx/count);
				}
				else if(x==1)
				{
					tempcentroid[i][x]=(centroidcounty/count);
				}
		}
	}
		int flag=0;
		for(int x=0;x<2;x++)
		{
			for(int i=0;i<k;i++)
			{
				if(centroid[i][x]!=tempcentroid[i][x])
				{
					flag=1;
					
				}
			}
		}
		if(flag==1)
		{
			for(int x=0;x<2;x++)
			{
				for(int i=0;i<k;i++)
				{
					centroid[i][x]=tempcentroid[i][x];
					
					
				}
			}
		}
		
		if(flag==1)
		{
		   methodcalculate(k,points,arr,tempcentroid);
		   
		}
		if(flag==0)
		{
			System.out.println("clusters are:");
			for(int i=0;i<k;i++)
			{
				System.out.println();
				System.out.print("------values from cluster---- :");
				System.out.print(i+1);
				System.out.println();
				for(int j=0;j<points;j++)
				{   System.out.println();
					if(cluster[i][j][0]!=0||cluster[i][j][1]!=0)
					{
						System.out.print(cluster[i][j][0]);
						System.out.print("  ");
						System.out.print(cluster[i][j][1]);
						System.out.println();
					}
				}
				System.out.println("-------------------------------");
			}
			System.out.println();
			for(int i=0;i<k;i++)
			{
				System.out.print("centroids for  clusters:");
				System.out.print(i+1);
				System.out.println();
				for(int j=0;j<2;j++)
				{
					System.out.print(centroid[i][j]);
					System.out.print("      ");
				}
				System.out.println();
				
			}
			
		}
		
	}
}

