package com.google;
/*
* Code for compound and simple interest calculating
* */
public class JPR17 {
    public static void main(String[] args) {
        int principal=161258;
        float rate=5.0f;
        int months=3;
        float simpleInterest,compoundInterest;

        //We have to calculate monthly simple Interest and compound Interest
        //we have principal=161258 , rate=5%, months =3
        //simple interest calculating:( principal*rate*months)/(100*12)

        simpleInterest=((principal*rate*months)/(100*12));
        System.out.println("Monthly Simple interest on amount "+principal+" and "+months+" months is: "+simpleInterest);

     //compound interest calculating:
     //principal=161258, year=1, rate=5%
        // Amount=p*(1+(0.05/12)^12) since, A=p*[1+(R/n)]^nt we are compounding monthly so n=12
        //  CI=amount-principal
        float amount= (float) (principal*((Math.pow(  (1+(0.05/12))  , 12) )));
        compoundInterest=(amount-principal);
        System.out.println("Monthly compound interest on amount "+principal+" and months "+months+" is: "+compoundInterest);


    }
}
