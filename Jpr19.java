package com.google;
/*
Author : suyash
code for demonstrate java methods
* */

public class Jpr19 {

//    method without argument and without return type
    void greet(){
        System.out.println("Good Morning...Have a nice day!");
    }

//    method with argument and with return type
    int add(int a,int b){
        return a+b;
    }

//    method without argument and with return type
    double temperatue(){
        return 25;
    }

//    method with argument and without return type
    void fullName(String fName,String mName,String lName ){
        System.out.println(fName+" "+mName+" "+lName);
    }

    // static method
//    We can call static method using class name
//    static method belongs to class...there is only one copy of static method
    static void course(){
        System.out.println("Java Programming");
    }


    static void outcome(){
        //lets call static method here
        JPR19.course();//yes we can call static method from this static method
        System.out.println("This course will give you knowledge about java and advance java ");
        //lets call instance method here
        JPR19 ob1=new JPR19();
        ob1.greet(); // yes we can call instance method but using object only
    }

    //instance method
    void instanceM(){
        System.out.println("Instance method called using object of this class only...");
        //lets call static method here
        JPR19.course(); // we can call static method inside insatance method
    }

    public static void main(String[] args) {

        JPR19 obj=new JPR19();
        obj.greet();//calling method without argument and without return type

        int a=obj.add(23,78);//calling method with argument and with return type
        System.out.println("The sum is: "+a);

        double temp=obj.temperatue();// calling method without argument and with return type
        System.out.println("Temperatue is: "+temp);

        obj.fullName("Vaibhavi","Dattatraya","Dixit");//calling method with argument and without return type

        // calling static method using class name
        JPR19.course();
        JPR19.outcome();

    }
}
