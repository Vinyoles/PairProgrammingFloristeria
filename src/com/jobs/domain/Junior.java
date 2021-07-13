package com.jobs.domain;

public class Junior extends Employee {
	
		public Junior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
			super(name, address, phone, salaryPerMonth, paymentRate);		
					
			this.salaryPerMonth=salaryPerMonth;
			this.paymentRate=paymentRate;
		}
		
		@Override
		public String toString() {
			return "Junior [nom=" + name  + ", adreça=" + address + ", telèfon=" + phone + ", sou mensual=" + salaryPerMonth + ", sou total=" + totalPaid + "] \n";
		}


		@Override
		public void pay() throws Exception{
			totalPaid=paymentRate.pay(salaryPerMonth);
			if(totalPaid < 900) {
				throw new Exception("El Junior cobra menys del que li toca\n");
			} else if (totalPaid > 1600) {
				throw new Exception("El Junior cobra més del que li toca\n");
			}
		}

}
