package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService{
	public boolean validateData(float principal,int tenure, int age, String gender) {
		
		if((principal>=500)&&(tenure==5||tenure==10)&&((gender.equalsIgnoreCase("Male")==true) ||(gender.equalsIgnoreCase("Female")==true))&&(age>=1&&age<=100))
			return true;
		else {
			try {
				throw new BankValidationException();
			} 
			catch (BankValidationException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
				return false;
			}	
		}
		
		
		
		/*if(principal<500||(!(tenure==5||tenure==10))||(!((gender.equalsIgnoreCase("Male")==true) ||(gender.equalsIgnoreCase("Female")==true)))||(!(age>1&&age<100))) {
			try {
				throw new BankValidationException();
			} catch (BankValidationException e) {
				return false;
			}
		}
		else
		return true;*/	
	}
	
	public void calculate(float principal, int tenure, int age, String gender) {
		boolean validData=validateData(principal,tenure,age,gender);
		if(validData==true) {
			RDAccount rd=new RDAccount(tenure,principal);
			rd.setInterest(age, gender);
			float maturityInterest = rd.calculateInterest();
			float totalPrincipleDeposited= rd.calculateAmountDeposited();
			System.out.println(totalPrincipleDeposited);
			System.out.println(maturityInterest);
			System.out.println(rd.calculateMaturityAmount(totalPrincipleDeposited, maturityInterest));
		}
	}
}


