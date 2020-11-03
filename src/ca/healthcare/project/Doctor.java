package ca.healthcare.project;

import java.util.ArrayList;

public class Doctor {
	private int doctorId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String specialty;
	ArrayList<Appointment> apointments = new ArrayList<Appointment>();
	
	public Doctor(String doctorId, String firstName, String lastName, String phoneNumber, String email, String specialty) {
		setDoctorId();
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setSpecialty(specialty);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getDoctorId() {
		return this.doctorId;
	}
	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		
		if(firstName.isEmpty() || firstName.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return this.firstName;
		}
	}
	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		
		if(lastName.isEmpty() || lastName.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return this.lastName;
		}
	}
	/**
	 * 
	 * @return
	 */
	public String getPhoneNumber() {
		
		if(phoneNumber.isEmpty() || phoneNumber.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return this.phoneNumber;
		}
	}
	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		
		if(email.isEmpty() || email.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return this.email;
		}
	}
	/**
	 * 
	 * @return
	 */
	public String getSpecialty() {
		
		if(specialty.isEmpty() || specialty.equalsIgnoreCase("")) {
			return "Unknown";
		} else {
			return this.specialty;
		}
	}
	/**
	 * 
	 */
	public void setDoctorId() {
		this.doctorId = (int)(Math.floor((Math.random() * 90001) + 1000));
		
	}
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	/**
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		
	}
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
		
	}
	/**
	 * 
	 * @param specialty
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
		
	}
	@Override
	public String toString() {
		return "Doctor Id : " + doctorId + 
				"\nFirst Name" + firstName + 
				"\nLast Name : " + lastName + 
				"\nPhone Number : " + phoneNumber +
				"\nEmail : " + email;
	}
	
	
}
