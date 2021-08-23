package com.google;

class Addition{
    //method overloading
    int result(int a,int b){
        return a+b;
    }
    int result(int a,int b,int c){
        return a+b+c;
    }
    int result(int a,int b,int c,int d){
        return a+b+c+d;
    }
}

class Subtraction extends Addition{
    //method overriding
    int result(int a,int b){
        return a-b;
    }
    int result(int a,int b,int c){
        return a-b-c;
    }
    int result(int a,int b,int c,int d){
        return a-b-c-d;
    }
}
class Multiplication extends Addition{
    //method overriding
    int result(int a,int b){
        return a*b;
    }
    int result(int a,int b,int c){
        return a*b*c;
    }
    int result(int a,int b,int c,int d){
        return a*b*c*d;
    }
}
class Division extends Addition{
    //method overriding
    int result(int a,int b){
        return a/b;
    }

}


public class JPR22 {

    public static void main(String[] args) {
        Addition a1=new Addition();
        Subtraction s1=new Subtraction();
        Multiplication m1=new Multiplication();
        Division d1=new Division();

        System.out.println("Sum: "+a1.result(1,2));
        System.out.println("Sum: "+a1.result(1,2,5));
        System.out.println("Sum: "+a1.result(1,2,9,6));

        System.out.println("Subtraction: "+s1.result(10,2));
        System.out.println("Subtraction:  "+s1.result(50,20,5));
        System.out.println("Subtraction: "+s1.result(77,26,19,4));

        System.out.println("Multiplication: "+m1.result(90,2));
        System.out.println("Multiplication: "+m1.result(12,2,4));
        System.out.println("Multiplication: "+m1.result(12,2,4,7));

        System.out.println("Division: "+d1.result(12,2));



    }//main method ends


}//JPR22 ends
