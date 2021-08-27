package com.google;
/*
Author: Suyash Shinde
code for demonstrate interface and final keyword
* */

// interface machine
interface Machine{
    void working();
    void functions();
}
//interface AI
interface AI{
    void intellisense();
}
// Here we have achieved multiple inheritance by implementing two interfaces
class Robot implements Machine,AI{
    final String name="Tesla Robot";
    final double ratings;
    Robot(){
        ratings=4.0; //initialize final variable here
    }

    //override methods of both interfaces
    public final void Intro(){
        System.out.println("Hello i am "+name+" i can obey your all commands.. ");
    }
    @Override
    public void working() {
        System.out.println("Intelligent Robot who can walk, talk and can obey your commands ");
    }

    @Override
    public void functions() {
        System.out.println("Can do anything like humans");
    }

    @Override
    public void intellisense() {
        System.out.println("It sense temperature and turn manipulate your AC temperature");
    }
}
//multilevel inheritance: Machine AI-> Robot-> RoboCar

class RoboCar extends Robot{

//    name="TeslaCar"; // we cannot override final variable
//    public void Intro(){ // We cannot override final method
//
//    }

    @Override
    public void working() {
        System.out.println("Tesla car can avoid traffic automatically and helps you to reach your destination ...You just want to seat in car do nothing else!");
    }

   
    @Override
    public void intellisense() {
        System.out.println("It has Radar Sensor, other cars on road and it can sense rain and turn on its wipers automatically also change the lane itself");
  
    
    @Override
      public void functions() {
          System.out.println("Tesla car automatically opening closing door , adjustable trunk size as well as self cooling and avoid collosions");
    }
  
  }


public class Jpr27 {

    public static void main(String[] args) {
        Robot r1=new Robot();//object of Robot
        r1.Intro();
        r1.functions();
        r1.intellisense();
        r1.working();

        RoboCar rc=new RoboCar(); //object of RoboCar
        rc.intellisense();
        rc.working();
        rc.functions();


    }//main method ends


}//Jpr27 ends
