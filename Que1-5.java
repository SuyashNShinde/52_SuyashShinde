Que.1)
  package com.Training;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java Skills";
		for(int i=s.length()-1; i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}



Que.2)
  package com.Training;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String x="12/10/2021";
     //Using spilt method 
     String y=x.split("/")[2];//Extract year;
     System.out.println("Year="+y);
	}

}



Que.3)
package com.Training;

public class Que3 {

	public static void main(String[] args) {
	int emp1=1100;//1st Employee
	int emp2=500;//2nd Employee
	int emp3;//3rd Employee
	// avg= emp1+emp2+emp3/3 
	int avg=1000*3;
	int sum=emp1+emp2;
    emp3=avg-sum;
    System.out.println("Thrid employee earn "+emp3);
	
	
	}

}




Que.4)
  package com.Training;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the percentage format of 30% is 30/100 in fraction
		int numerator=30;
		int denominator=100;
		//Reduce the Fraction by taking common factor of the numerator and denominator 
		int common_fac=10;
		int nume=numerator/common_fac;
		int deno=denominator/common_fac;
		System.out.println("The Fraction of 30% is "+ nume+ "/" + deno);
		
		

	}

}




Que.5)
  package com.Training;

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int len=340;//length of train;
         int len_tunnel=160; //lenth of tunnel
         int distance= len+len_tunnel;//Total distance to be covered 
         double time;
         double speed=45.0;
         /*we have speed in km/hr and length of trian and tunnel given in m unit 
         so we need to convert it
         45 km/hr=45*1000/3600 m/s
         speed= 25/2 m/s
          */
         speed=(double) speed*(1000/3600.0);
         time=distance/speed;
         System.out.println("Time requried "+ time+ " sec");
	}

}
