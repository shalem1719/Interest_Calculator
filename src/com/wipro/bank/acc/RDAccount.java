package com.wipro.bank.acc;

public class RDAccount extends Account {
	public RDAccount(int tenure, float principal) {
		this.tenure=tenure;
		this.principal=principal;
	}
	
	public float calculateAmountDeposited() {
		return principal*tenure*12;
	}
	
	public float calculateInterest() {
		float interest=0f;
		float r=rateOfInterest/100;
		int n=4;
		int tn=tenure*12;
		for(int i=0;i<tn;i++)
		{
			
			float b=(float) (n*((tn-i)/12.0));
			interest+=principal*(float)(Math.pow(1+(r/n),b)-1);
		}
		return interest;
	}
}
