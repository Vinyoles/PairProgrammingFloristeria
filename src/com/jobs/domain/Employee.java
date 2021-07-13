package com.jobs.domain;

public abstract class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<=0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}
	
	
	@Override
	public String toString() {
		return "Employee [nom=" + name  + ", adreça=" + address + ", telèfon=" + phone + ", sou mensual=" + salaryPerMonth + ", sou total=" + totalPaid + "] \n";
	}


	@Override
	public void pay() throws Exception{
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

}
