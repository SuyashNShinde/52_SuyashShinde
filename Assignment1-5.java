1) Reverse a String and Print it on Console "Java Skills"
package com.google;

public class Ass1 {
    public static void main(String[] args) {

        String myStr="JavaSkills";

        for(int i=myStr.length()-1; i>=0; i--)//last index of string is its length-1 and first index starts with o
        {
            System.out.print(myStr.charAt(i));
        }
    }
}




2)Assign String to x variable in DD-MM-YYYY format extract and print Year from String
package com.google;

public class Ass2 {
    public static void main(String[] args) {
        String x="18-03-2003";
        // using split method on string object...it return array of splited characters
        String d=x.split("-")[0];// extract date
        String m=x.split("-")[1];// extract month
        String y=x.split("-")[2];// extract year

        System.out.println("Year : "+y);
    }
}




3)code for calculate salary of employee
package com.google;

public class Ass3 {
    public static void main(String[] args) {
        int avgOfThreeEmpInOneWeek=1000; //We have given that average salary of 3 employees in one week is 1000
        int E1_Salary=1100;
        int E2_Salary=500;
        float E3_Salary; // we have to find third employee salary

        // we know 1000(avg)=(1100(E1)+500(E2)+E3) / 3 .....3 because there are 3 employees
        //E3 =  1000*3 / (1100+500)
        E3_Salary= (float) ((avgOfThreeEmpInOneWeek*3.0)/ (E1_Salary+E2_Salary));
        System.out.println("Salary of thid employee is: "+E3_Salary);
    }
}




4)code for convert percentage to fraction
package com.google;

public class Ass4 {
    public static void main(String[] args) {
        int per=30; //percentage = 30%
        // To convert percentage into fraction simply remove % sign and divide that by 100
        // we can reduce fraction further
        int numerator=per;
        int denominator=100;
        // fraction = numerator / denominator
        System.out.println(" Fraction of "+ per+" % is: "+numerator+"/"+denominator);
        // to reuduce we can divide nume and denom by 10 ..both are divisible by 10..
        numerator=per/10;
        denominator=100/10;
        System.out.println(" Fraction of "+ per+" % is: "+numerator+"/"+denominator);
      }
}




5)code for calculate time duration in which a 340m
long train can pass 160m long tunnel at speed 45 km/hr
package com.google;

public class Ass5 {
    public static void main(String[] args) {

        int trainLength=340;//340 m long train
        double speed=45.0;//45 km/hr speed of train
        int tunnel=160; //160m long tunnel

        /*
        * Here we have given speed in km/hr and length of train and tunnel in m unit...
        * first we have to convert km/hr in m/s
        * 45 km/hr= 45* 1000/3600 m/s
        * Speed= 25/2 m/s
        * Total distance to cover (340+160)m= 500m
        * time = distance/speed
        *        500/ (25/2)
        *        500*(2/25)
        *        40 seconds
        * */

        speed=(double) speed*(1000/3600.0);
        int distance=tunnel+trainLength;
        double time=distance/speed;

        System.out.println(" Time required :"+ time+" Seconds");


    }
}
