package com.jobs.domain;

public class Boss extends Employee{
	public Boss(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);		
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	@Override
	public String toString() {
		return "Boss [nom=" + name  + ", adreça=" + address + ", telèfon=" + phone + ", sou mensual=" + salaryPerMonth + ", sou total=" + totalPaid + "] \n";
	}


	@Override
	public void pay() throws Exception{
		totalPaid=paymentRate.pay(salaryPerMonth);
		if(totalPaid < 8000) throw new Exception("El Boss cobra menys del que li toca!\n");
	}

}
