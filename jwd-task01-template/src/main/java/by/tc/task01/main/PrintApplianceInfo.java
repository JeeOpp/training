package by.tc.task01.main;

import by.tc.task01.entity.Appliance;


public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		if (appliance == null)
			System.out.println("not found");
		else{
			System.out.println("found "+appliance.toString());
		}
	}
	
	// you may add your own code here

}
