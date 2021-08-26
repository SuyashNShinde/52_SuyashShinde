/**
 * 
 */
package JavaTraining;

/**
 * @author Suyash Shinde
 * 
 */
//code for demonstrate inheritance

// super class Microsoft
class Microsoft{
    static String company="Microsoft";
    int noOfEmployees=86000;
    void print(){
        System.out.println("Welcome to "+company);
        System.out.println("We have "+noOfEmployees+" no of employees.");
    }
    void work(){
        System.out.println("We are working in Microsoft");
    }
}
/*
Single inheritance
Super class-Microsoft
 child class- Development*/

class Development extends Microsoft{
    int noOfEmployees=6000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in development department.");
    }
    void work(){
        System.out.println("We are working in development department of "+company);
    }

}

/*
hierarchical inheritance
Super class-Microsoft
 child class- Design*/

class Design extends Microsoft{
    int noOfEmployees=10000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in design department.");
    }
    void work(){
        System.out.println("We are working in design department of "+company);
    }
}

/*
multilevel inheritance
first super class-Microsoft
Second Super class-Design
 child class- Testing */

class Testing extends Design{
    int noOfEmployees=15000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in testing department.");
    }
    void work(){
        System.out.println("We are working in testing department of "+company);
    }
}

/*
single inheritance
Super class-Microsoft
 child class- Sales*/

class Sales extends Microsoft{
    int noOfEmployees=20000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in sales department.");
    }
    void work(){
        System.out.println("We are working in sales department of "+company);
    }
}

/*
multilevel inheritance
first Super class-Microsoft
second super class- Sales
 child class- Account*/

class Account extends Sales{
    int noOfEmployees=35000;
    void print(){
        System.out.println("We have "+noOfEmployees+" no of employees in account department.");
    }
    void work(){
        System.out.println("We are working in account department of "+company);
    }
}

public class Jpr24 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		  Microsoft m1=new Microsoft();
	        m1.print();
	        m1.work();

	        Development d1=new Development();
	        d1.work();
	        d1.print();

	        Design ds=new Design();
	        ds.print();
	        ds.work();

	        Testing t1= new Testing();
	        t1.print();
	        t1.work();

	        Sales s1=new Sales();
	        s1.print();
	        s1.work();

	        Account ac=new Account();
	        ac.work();
	        ac.print();
	    
        }

}

