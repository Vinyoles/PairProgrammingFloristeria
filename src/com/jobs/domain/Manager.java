package com.jobs.domain;

public class Manager extends Employee{
	public Manager(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);		
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	@Override
	public String toString() {
		return "Manager [nom=" + name  + ", adreça=" + address + ", telèfon=" + phone + ", sou mensual=" + salaryPerMonth + ", sou total=" + totalPaid + "] \n";
	}


	@Override
	public void pay() throws Exception{
		totalPaid=paymentRate.pay(salaryPerMonth);
		if(totalPaid < 3000) {
			throw new Exception("El Manager cobra menys del que li toca\n");
		} else if (totalPaid > 5000) {
			throw new Exception("El Manager cobra més del que li toca\n");
		}
	}

}
