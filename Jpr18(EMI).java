package com.google;

public class JPR18 {
    public static void main(String[] args) {
        int y1 =5;
        int y2=3;
        int amount=161258;

        float EMI;
        //calculating emi for principal  = 161258 , years=5 years, rate=5% per month:
        //        EMI = P × r × (1 + r)^n / ((1 + r)^n - 1)
        //        where P= Loan amount, r= interest rate, n=tenure in number of months.
        //n= 5 years*12=60 months

        float r=(5.0f/100);
        float rpl1=1+r;
        float numerator= (float) (amount*r*Math.pow(rpl1,60));
        float denom= (float) (Math.pow(rpl1,60)-1);
        EMI=numerator/denom;
        System.out.println("EMI for amount "+amount+" of "+y1+" Years is: "+EMI);

        //calculating emi for principal  = 161258 , years=3 years, rate=5% per month:
        //        EMI = P × r × (1 + r)^n / ((1 + r)^n - 1)
        //        where P= Loan amount, r= interest rate, n=tenure in number of months.
        //n= 3 years*12=36 months

        r=(5.0f/100);
        rpl1=1+r;
        numerator= (float) (amount*r*Math.pow(rpl1,36));
        denom= (float) (Math.pow(rpl1,36)-1);
        EMI=numerator/denom;
        System.out.println("EMI for amount "+amount+" of "+y1+" Years is: "+EMI);



    }
}
