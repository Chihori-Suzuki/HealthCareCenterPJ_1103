package ca.healthcare.project;

import java.time.LocalDate;

public class Appointment {
	private Patient patient;
	private LocalDate appointmentDate;
	
	public Appointment(Patient patient, LocalDate appointmentDate) {
//		super();
		this.patient = patient;
		this.appointmentDate = appointmentDate;
	}
	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}
	/**
	 * @return the appointmentDate
	 */
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	/**
	 * @param appointmentDate the appointmentDate to set
	 */
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
	public String toString() {
		return "Patient: " + patient + ". Appointment date: " + appointmentDate;
	}
	
}
