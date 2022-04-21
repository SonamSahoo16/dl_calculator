package com.personal.dlcalculator;

import java.time.LocalDate;
import java.util.Scanner;

import com.personal.dlcalculator.model.PersonDetails;

public class DLCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year of birth : ");
		int yr=Integer.parseInt(sc.nextLine());
		int current_year=LocalDate.now().getYear();
		int age=current_year-yr;
		
		if(age>=18)
		{
			System.out.println("Eligible for DL");
			fetchDetails(sc);
			
		}
		else
		{
			System.out.println("Not eligible for DL");
		}
	}

	private static void fetchDetails(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		
		System.out.println("Enter your address:");
		String address=sc.nextLine();
		
		System.out.println("Enter your blood group:");
		String bloodGroup=sc.nextLine();
		
		PersonDetails pp= new PersonDetails();
		pp.setName(name);
		pp.setBloodGroup(bloodGroup);
		pp.setAddress(address);
		
		System.out.println(pp.toString());
		
		sc.close();
	}

}
