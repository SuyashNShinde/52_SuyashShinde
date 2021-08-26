package com.Training;

public class Jpr25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmetic a= new result();
		a.add();
		a.sub();
		a.mul();
		a.div();
	}//end main
	
}//end class

 abstract class arithmetic
{
	 int a=70;
	 int b=60;
	 //abstract methods
	public abstract void add();
	public abstract void sub();
	public abstract void mul();
	public abstract  void div();
}// end arithmetic 

 //class result extends arithmetic class
class result extends arithmetic
{
	public void add()
	{
	 System.out.println("Addition is "+(a+b));
	}
	public void sub()
	{
		
		 System.out.println("Substraction is "+(a-b));
	}
	public void mul()
	{
		
		 System.out.println("Multiplication is "+(a*b));
	}
	public void div()
	{
		
		 System.out.println("Division is "+(a/b));
	}
	
}








package com.Training;

public class Jpr26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 myinterface m=new Demo();
		 m.add();
		 m.sub();
		 m.mul();
		 m.div();
	}

}
interface myinterface
{

	final int i=77;
	final int j=13;
	public void add();
	public void sub();
	public void mul();
	public void div();


}// end myinterface
// Demo class implements myinterface 

class Demo implements myinterface
{
	public void add()
	{
	 System.out.println("Addition is "+(i+j));
	}
	public void sub()
	{

		 System.out.println("Substraction is "+(i-j));
	}
	public void mul()
	{

		 System.out.println("Multiplication is "+(i*j));
	}
	public void div()
	{

		 System.out.println("Division is "+(i/j));
	}

}//end Demo
