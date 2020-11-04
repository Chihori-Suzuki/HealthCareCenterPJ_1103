package ca.healthcare.project;

import java.util.ArrayList;

public class Doctor extends User{
	private String specialty;
	private ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	
	public Doctor(int doctorId, String firstName, String lastName, String phoneNumber, String email, String specialty, ArrayList<Appointment> appointments) {
		super(doctorId, firstName, lastName, phoneNumber, email);
//		setDoctorId(doctorId);
//		setFirstName(firstName);
//		setLastName(lastName);
//		setPhoneNumber(phoneNumber);
//		setEmail(email);
		setSpecialty(specialty);
		setAppointment(appointments);
	}
	

	/**
	 * 
	 * @return specialty
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
	 * @return appointments
	 */
	public ArrayList<Appointment> getAppointment() {
		return appointments;
	}
	

	/**
	 * 
	 * @param specialty
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
		
	}
	/**
	 * 
	 * @param appointments
	 */
	public void setAppointment(ArrayList<Appointment> appointments) {
		this.appointments = appointments;
		
	}
	@Override
	public String toString() {
		return super.toString() + 
				"\nAppointment : " + appointments.toString() ;
		
	}
	
	
}
