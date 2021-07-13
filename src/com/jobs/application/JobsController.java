package com.jobs.application;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Boss;
import com.jobs.domain.Manager;
import com.jobs.domain.Junior;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBoss(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		
		Boss boss = new Boss(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	/*public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		
		Employee empleat = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(empleat);
	}*/
	
	public void createJunior(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		
		Junior junior = new Junior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateJunior());
		repository.addMember(junior);
	}
	
	public void createMid(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		
		Mid mid = new Mid(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateMid());
		repository.addMember(mid);
	}
	
	public void createSenior(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		
		Senior senior = new Senior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateSenior());
		repository.addMember(senior);
	}

	public void createManager(String name, String address, String phone, double salaryPerMonth) throws Exception{
		
		Manager manager = new Manager(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		
	}


	public void payAllEmployeers(){
		
		List<AbsStaffMember> lista = repository.getAllMembers();
		
		for(AbsStaffMember e: lista) {
			
			try {
				e.pay();
			} catch(Exception x) {
				System.out.print(x.getMessage());
			}
		
		}
	
	}

	public String getAllEmployees() {
		
		String res = "";
		List<AbsStaffMember> lista = repository.getAllMembers();
		
		for(AbsStaffMember e: lista) {
			res = res + e;
		}
		
		return res;
	}

	public void createVolunteer(String string, String string2, String string3, String string4) throws Exception {
		
		Volunteer voluntari = new Volunteer (string, string2, string3, string4);
		repository.addMember(voluntari);
		
	}
	
	
	
}
