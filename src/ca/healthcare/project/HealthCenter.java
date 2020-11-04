package ca.healthcare.project;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class HealthCenter {
	
	public static Doctor checkDoctorId(int doctorId, ArrayList<Doctor> doctors) {
		for(Doctor d : doctors) {
			if(d.getDoctorId() == doctorId) {
				return d;
			}
		}
		System.out.println("It's an incorrect doctor ID");
		return null;
	}
	public static Patient checkPatientId(int patienId, ArrayList<Patient> patients) {
		for(Patient p : patients) {
			if(p.getPatientID() == patienId) {
				return p;
			}
		}
		System.out.println("It's an incorrect patint ID");
		return null;
	}
	
	public static String listOfAppointment(int doctorId,  ArrayList<Doctor> doctors) {
		for(Doctor d : doctors) {
			if(d.getDoctorId() == doctorId) {
				for (Appointment a : d.getAppointment()) {        //incorrect 
					System.out.println("Appointment Date : " + a.getAppointmentDate() +
							"\nAppointment Time : " + a.getAppointmentTime() + 
							"\nName : " + a.getPatient().getFirstName() + " " + a.getPatient().getLastName() + "\n");
				}
				return "";
			}
		}
		return "Out of the List";
	}
	
	
	public static void main(String[] args) {

		ArrayList<Patient> patients = new ArrayList<Patient>();
		Patient p1 = new Patient(1001, "Woody", "Woodpecker", "798 156 99855", "woodytoon@msn.com", LocalDate.of(1975, 12, 12), 'M');
		Patient p2 = new Patient(1002, "Lightnin", "McQueen", "744 456 2891", "mcQueen@msn.com", LocalDate.of(2000, 03, 14), 'M');
		Patient p3 = new Patient(1003, "Sailor", "Mars", "", "sailormoon@msn.com", LocalDate.of(1955, 01, 21), 'W');
		Patient p4 = new Patient(1004, "Minnie", "Mouse", "964 114 7654", "miniemouse@msn.com", LocalDate.of(1929, 11, 30), 'W');
		Patient p5 = new Patient(1005, "Bruce", "Wayne", "778 512 0129", "brucewayne@msn.com", LocalDate.of(2018, 01, 29), 'M');
		Patient p6 = new Patient(1006, "Shrek", "Charming", "546 879 1456", "shrekcharming@msn.com", LocalDate.of(1989, 03, 14), 'M');
		Patient p7 = new Patient(1007, "Clint", "Eastwood", "798 545 5462", "clinteastwood@msn.com", LocalDate.of(1900, 1, 2), 'M');
		Patient p8 = new Patient(1008, "Sarah", "Connor", "666 666 6666", "judgementday@msn.com", LocalDate.of(1975, 5, 5), 'w');
		Patient p9 = new Patient(1009, "Pepper", "Pots", "975 685 5671", "mrsstark@msn.com", LocalDate.of(1965, 8, 21), 'W');
		Patient p10 = new Patient(1010, "He", "Man", "951 314 5576", "skull@msn.com", LocalDate.of(1949, 9, 28), 'M');
		patients.add(p1);
		patients.add(p2);
		patients.add(p3);
		patients.add(p4);
		patients.add(p5);
		patients.add(p6);
		patients.add(p7);
		patients.add(p8);
		patients.add(p9);
		patients.add(p10);
		
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		Appointment app1 = new Appointment(p1, LocalDate.of(1975, 12, 12), LocalTime.of(12, 00, 00));
		Appointment app2 = new Appointment(p2, LocalDate.of(1975, 12, 12), LocalTime.of(12, 00, 00));
		ArrayList<Appointment> appList = new ArrayList<Appointment>();
		appList.add(app1);
		appList.add(app2);
		
		Doctor d1 = new Doctor(1010, "Junayd", "Bevan", "111-222-3333", "AAA@gmail.com", "Specialty1", appList);
		Doctor d2 = new Doctor(1020, "Darryl", "Humphries", "110-222-3333", "BBB@gmail.com", "Specialty2", appList);
		Doctor d3 = new Doctor(1030, "Kaylen", "Carrillo", "111-111-3333", "CCC@gmail.com", "Specialty3", appList);
		Doctor d4 = new Doctor(1040, "Jadon", "Glover", "111-999-3333", "DDD@gmail.com", "Specialty4", appList);
		doctors.add(d1);
		doctors.add(d2);
		doctors.add(d3);
		doctors.add(d4);
				

		Scanner input = new Scanner(System.in); //Scanner class cleate
		while(true) {
			System.out.println("Please enter your user. (d / p)");
			String user = input.nextLine();	//Scanner input 
			
			if(user.equalsIgnoreCase("d")) { // if user is doctor
				int doctorId;
				while(true){
					System.out.println("Please enter your doctor ID.");
					doctorId = input.nextInt();
					if (!checkDoctorId(doctorId, doctors).equals(null)) break;// Check the Doctor ID
				}
				System.out.println(listOfAppointment(doctorId, doctors));
				break;
				
			} else if (user.equalsIgnoreCase("p")) { //if user is patient
				// method is invoked
				int patientId;
				Patient p; // create Patient 
				while(true){
					System.out.println("Please enter your patient ID.");
					patientId = input.nextInt();
					p = checkPatientId(patientId, patients);  //it return 
					if (!p.equals(null)) break;// Check the Patient ID
				}
				System.out.println("Pleare enter the time and date");
				System.out.print("Year : ");
				int year = input.nextInt();
				System.out.print("Month : ");
				int month = input.nextInt();
				System.out.print("Day : ");
				int day = input.nextInt();
				System.out.print("time : ");
				int time = input.nextInt();
				System.out.print("minutes : ");
				int min = input.nextInt();
				
				LocalDate appointDay = LocalDate.of(year, month, day);
				LocalTime appointTime = LocalTime.of(time, min, 00);
				Appointment patientApp = new Appointment(checkPatientId(patientId, patients), appointDay, appointTime);
				
				int doctorId;
				Doctor d; //create Doctor
				
				while(true){
					System.out.println("Please enter your doctor ID.");
					doctorId = input.nextInt();
					d = checkDoctorId(doctorId, doctors);
					if (!d.equals(null)) break;// Check the Doctor ID
				}
				d.getAppointment().add(patientApp); //add the Appointment
				//Sysout the detail of appointment
				System.out.println("Your appointment : " + appointDay + " " + appointTime +
						"\nFirst name : " + p.getFirstName() + " " + p.getLastName() +
						"\nDoctor name : " + d.getFirstName() + " " + d.getLastName()); 
				
				break;
			} else {
				System.err.println("It's incorrect user.");
			}
		}
	}
}
