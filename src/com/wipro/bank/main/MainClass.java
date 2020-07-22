package com.wipro.bank.main;

import com.wipro.bank.service.BankService;

public class MainClass {
	public static void main(String args[]) {
        int tenure = 5;
        float principal = 1000;
        int age = 23;
        String gender = "Male";
        BankService b=new BankService();
       // b.calculate(principal, tenure, age, gender);

        
       //b.calculate(456, 6, 45, "female");
        // Invalid Data
        
        //b.calculate(556, 6, 45, "female");
        //Invalid Data
        
        //b.calculate(556, 10, 45, "female");
        /*  
         48890.17
		 66720.0
		 115610.17
        */
        
        //b.calculate(9858, 5, 0, "male");
        //Invalid Data
        
        //b.calculate(9858, 5, 101, "male");
        //Invalid Data
        
        //b.calculate(9858, 5, 05, "m");
        //Invalid Data
        
        //b.calculate(9858, 5, 05, "f");
        //Invalid Data
        
        //b.calculate(9858, 5, -5, "m");
        //Invalid Data
        
        
        //b.calculate(9858, -5, 05, "male");
        //Invalid Data
        
        
        //b.calculate(10000, 10, 55, "male");
        //Invalid Data
        /*832373.44
1200000.0
2032373.5*/
        
        //b.calculate(10000, 10, 60, "male");
        /*  915372.06
1200000.0
2115372.0  */
        
        //b.calculate(10000, 10, 55, "female");
        /*
         879319.6
1200000.0
2079319.6
*/
        //b.calculate(10000, 10, 58, "female"); 
        
        /*952168.1
1200000.0
2152168.0  */
        
        //b.calculate(10000, 10, 100, "female");
        /*952168.1
        1200000.0
        2152168.0  */
        
        
       //b.calculate(10000, 9, 100, "female");
        // Invalid Data
	}
}
