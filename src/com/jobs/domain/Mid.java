package com.jobs.domain;

public class Mid extends Employee {
	
	public Mid(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);		
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	@Override
	public String toString() {
		return "Mid [nom=" + name  + ", adreça=" + address + ", telèfon=" + phone + ", sou mensual=" + salaryPerMonth + ", sou total=" + totalPaid + "] \n";
	}


	@Override
	public void pay() throws Exception{
		totalPaid=paymentRate.pay(salaryPerMonth);
		if(totalPaid < 1800) {
			throw new Exception("El Mid cobra menys del que li toca\n");
		} else if (totalPaid > 2500) {
			throw new Exception("El Mid cobra més del que li toca\n");
		}
	}

}
