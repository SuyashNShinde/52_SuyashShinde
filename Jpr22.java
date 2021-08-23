package com.Training;

public class Jpr22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmatic_Operation obj=new Arithmatic_Operation();
		//Method overloading
		System.out.println(obj.Mul(10,20));
		System.out.println(obj.Mul(45,20,45));
		System.out.println(obj.Mul(70,28,76,87));
		////Method overriding 
		Arithmatic_Operation obj1=new Arithmatic_Operation();
		Arithmatic_Operation obj2=new sub_class();
		sub_class obj3= new sub_class();
		obj1.print();
		obj2.print();
		obj3.print();	

	}// end main

}// end class

//Super class
class Arithmatic_Operation {
	int Mul(int a,int b)
	{
		return(a*b);
		
	}
	int Mul(int a,int b,int c)
	{
		return(a*b*c);
		
	}
	int Mul(int a,int b,int c,int d)
	{
		return(a*b*c*d);
		
	}
	void print()
	{
		System.out.println("Its From Superclass");
	}
}//end Arithmatic_Operation

//Subclass


class sub_class extends Arithmatic_Operation{
	void print()
	{
		System.out.println("Its from Subclass");
	}
	

}//end sub_class
