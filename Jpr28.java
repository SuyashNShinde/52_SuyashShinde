package com.google;
/*
Author: Suyash Shinde
code for calculate area of shapes
* */
//----------Abstraction------
abstract class Area
{
    final float PI=3.14f; //final variable
    abstract public void area();
}
//-------Inheritance--------
//Inheritance Oval->Area
//-----Class----
class Oval extends Area{
    int x,y;
    float area;

    Oval(int x,int y){
        this.x=x;
        this.y=y;
    }
    //-------Polymorphism--------
    //override abstract method
    @Override
    public void area() {
        area=x*y*PI;
        System.out.println("Area of Oval is : "+area);
    }
}
//inheritance  Triangle->Area
class Triangle extends Area{
    int base,height;
    float area;

    Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    //override abstract method
    @Override
    public void area() {
        area= (float) (0.5*base*height);
        System.out.println("Area of Triangle is : "+area);
    }
}
//-------------Interface-----------
interface shape{
    float PI=3.14f; //final variable by default
    void area();
}
//Inheritance Rectangle->shape
class Rectangle implements shape{
    int x,y;
    float area;
    Rectangle(int x,int y){
        this.x=x;
        this.y=y;
    }
   //override area method of interface shape
    @Override
    public void area() {
        area=x*y;
        System.out.println("Area of rectangle is: "+area);
    }
}
//Inheritance Pentagon->shape
class Pentagon implements shape{
    int side,apothem;
    float area;
    Pentagon(int side,int apothem){
        this.apothem=apothem;
        this.side=side;
    }

    @Override
    public void area() {
        area=(float)(5/2)*side*apothem;
        System.out.println("Area of pentagon is: "+area);
    }
}
//Inheritance Hexagon->shape
class Hexagon implements shape{
    int side;
    final double rt=(3*Math.sqrt(3))/2;
    double area;
    Hexagon(int side){
        this.side=side;
    }

    @Override
    public void area() {
        area=(double)rt*side*side;
        System.out.println("Area of Hexagon is: "+area);
    }

}
//Inheritance Trapezium->shape
class Trapezium implements shape{
    int a,b,h;
    float area;
    Trapezium(int a,int b,int h){
        this.a=a;
        this.b=b;
        this.h=h;
    }

    @Override
    public void area() {
        area=(float)(0.5)*a*b*h;
        System.out.println("Area of Trapezium is: "+area);
    }
}
//Inheritance Circle->shape
class Circle implements shape{
    double radius;
    double area;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void area() {
        area=PI*radius*radius;
        System.out.println("Area of circle is : "+area);
    }
}


public class Jpr28 {
    public static void main(String[] args) {
        Area a=new Oval(17,7); //------Objects-----
        a.area();

        a=new Triangle(10,12);
        a.area();

        shape sp=new Rectangle(30,18);
        sp.area();

        sp=new Pentagon(5,3);
        sp.area();

        sp=new Hexagon(8);
        sp.area();

        sp=new Trapezium(2,7,4);
        sp.area();

        sp=new Circle(5.8);
        sp.area();

    }//main method ends
}//Assign1 ends









