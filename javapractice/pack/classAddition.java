/**
 * 
 * @author sai
 * This package is useful to perform some arithmetic calculations.
 *
 */
package pack;
/**
 * 
 * @author sai
 * This class is useful to find sum of two numbers.It has a parameterized constructor and a method.
 *
 */

public class classAddition {
	private double d1,d2;
	/**
	 * This is parameterized constructor
	 * @param a is a double type value
	 * @param b is a double type value
	 */
	public classAddition(double a, double b)
	{
		d1=a;
		d2=b;
	}
	/**
	 * This method is useful to find sum of two numbers
	 * 
	 */
	public void sum(){
		System.out.println("sum="+(d1+d2));
	}
	/**
	 * This is the main method to implement addition
	 * @param args is a string type
	 */
	public static void main(String[] args){
		classAddition cA=new classAddition(10.2,3.5);
		cA.sum();
	}

}
