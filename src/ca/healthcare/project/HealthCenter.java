package ca.healthcare.project;

import java.util.Scanner;

public class HealthCenter {
	
	public static void main(String[] args) {
		Doctor doctor1 = new Doctor(1010, "Junayd", "Bevan", "111-222-3333", "AAA@gmail.com", "Specialty1");
		Doctor doctor2 = new Doctor(1020, "Darryl", "Humphries", "110-222-3333", "BBB@gmail.com", "Specialty2");
		Doctor doctor3 = new Doctor(1030, "Kaylen", "Carrillo", "111-111-3333", "CCC@gmail.com", "Specialty3");
		Doctor doctor4 = new Doctor(1040, "Jadon", "Glover", "111-999-3333", "DDD@gmail.com", "Specialty4");
		

		Patient patient1 = new Patient(2010, "Faith", "Lake", "111-222-3333", "AAA@gmail.com", ,"f");
		Patient patient2 = new Patient(2020, "Maddie", "Bonilla", "110-222-3333", "BBB@gmail.com", , "m");
		Patient patient3 = new Patient(2030, "Taslima", "Coulson", "111-111-3333", "CCC@gmail.com", , "f");
		Patient patient4 = new Patient(2040, "Isis", "Tierney", "111-999-3333", "DDD@gmail.com", , "m");
		Patient patient5 = new Patient(2050, "Suzannah", "Marin", "111-222-3333", "EEE@gmail.com", ,"f");
		Patient patient6 = new Patient(2060, "Darien", "Bassett", "110-222-3333", "FFF@gmail.com", , "m");
		Patient patient7 = new Patient(2070, "Momina", "Becker", "111-111-3333", "GGG@gmail.com", , "f");
		Patient patient8 = new Patient(2080, "Millie", "Meyer", "111-999-3333", "HHH@gmail.com", , "m");
		Patient patient9 = new Patient(2090, "Karan", "Atherton", "111-222-3333", "III@gmail.com", ,"f");
		Patient patient10 = new Patient(2100, "Asmaa", "Castillo", "110-222-3333", "JJJ@gmail.com", , "m");
		

		Scanner input = new Scanner(System.in); //Scanner class cleate
		while(true) {
			System.out.println("Please enter your user. (d / p)");
			String user = input.nextLine();	//Scanner input 
			
			if(user.equalsIgnoreCase("d")) { // if user is doctor
				// method is invoked
				break;
			} else if (user.equalsIgnoreCase("p")) { //if user is patient
				// method is invoked
				break;
			} else {
				System.err.println("It's incorrect user.");
			}
		}
		
	}
}
