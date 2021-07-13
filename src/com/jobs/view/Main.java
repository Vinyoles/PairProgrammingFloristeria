package com.jobs.view;

import com.jobs.application.JobsController;
import com.jobs.application.PaymentFactory;

public class Main {

	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		//JobsController controller=new JobsController(); -- és el mateix
				
		controller.createBoss("Pepe Boss", "Dirección molona", "666666666", 10000);
		controller.createJunior("Laura Junior", "Dirección molona 3", "625266666", 1100);
		controller.createMid("Pedro Mid", "Dirección molona 3", "625266666", 2050.0);
		controller.createSenior("Antoni Senior", "Dirección molona 3", "625266666", 3200.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666", "no cobra");
		controller.createManager("Pepe Manager", "Dirección molona 5", "665226891", 4200.0);	
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: \n" + allEmployees + " \n");
		
		
	}

}
