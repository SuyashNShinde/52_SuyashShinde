package com.Training;

class Methods{
	
	int a;
	int b;
	int sum;
	float mul;
	float div;
	static int mod;
	//instance method 
	void initialize()
	{
		a=10;
		b=20;	
	}
	//Without Return Type and Argument
	void Woutrearg()
	{
		initialize();//invoking instance method inside instance method 
		sum=a+b;
		System.out.println("Addition is "+sum);
	}
	//With Argument and Without Return type
	void Witharg(int c , int d)
	{
		mul=c*d;
		System.out.println("Multiplication is "+mul);
	}
	//With Argument and Return type
	float withrearg(float x,float y)
	{
		div=x/y;
		return div;
	}
	//Static Method with return type and with argument
	
	static int Withrearg(int p,int q)
	{
	mod=p%q;
	return mod;
	}
	static void  Printmethod()
	{
	int ret=Withrearg(50,10);//invoking static method inside static method
	System.out.println("Mod is  "+ret );
	}
	
     }

public class Jpr21 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Methods obj = new Methods();
	obj.Woutrearg();
	obj.Witharg(65,12);
	float retdiv=obj.withrearg(52,3);
	System.out.println("Division is "+retdiv);
	Methods.Printmethod();
	
	
		

	
  }//end main


}//end Jpr21
