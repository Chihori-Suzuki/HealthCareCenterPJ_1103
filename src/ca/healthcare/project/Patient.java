package ca.healthcare.project;

import java.time.LocalDate;

public class Patient {
	private int patientID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	private LocalDate dateBirth;
	private char gender;
	private String DEFAULT = "Unknown"; 
	
	public Patient(int patientID, String firstName, String lastName, String phoneNum, String email, LocalDate dateBirth,
			char gender) {
		setPatientID(patientID);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNum);
		setEmail(email);
		setDateBirth(dateBirth);
		setGender(gender);
	}
	/**
	* @return the patientID
	*/
	public int getPatientID() {
		return patientID;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the dateBirth
	 */
	public LocalDate getDateBirth() {
		return dateBirth;
	}
	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}
	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(int patientID) {
		if(patientID >= 1000 && patientID <= 10000) {
		this.patientID = patientID;
		} else {
			System.err.println("Patient ID number is incorrect");
		}
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
		this.firstName = firstName;
		} else {
			this.firstName = DEFAULT;
		}
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if(!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
			} else {
				this.lastName = DEFAULT;
			}
	}
	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		if(!phoneNum.isEmpty() && !phoneNum.equalsIgnoreCase(null)) {
			this.phoneNum = phoneNum;
			} else {
				this.phoneNum = DEFAULT;
			}
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		if(!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
			} else {
				this.email = DEFAULT;
			}
	}
	/**
	 * @param dateBirth the dateBirth to set
	 */
	public void setDateBirth(LocalDate dateBirth) {
		LocalDate d = LocalDate.of(1910, 1, 1);
		if(dateBirth.compareTo(d) > 0) {
			this.dateBirth = dateBirth;
		} else { this.dateBirth = (d);}
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		if(gender == 'M' || gender == 'm') {
			this.gender = 'M';
		} else if(gender == 'W' || gender == 'w') {
			this.gender = 'W';
		} else {
			this.gender = 'U';
		}
	}
	public String toString() {
		return "Patient ID " + patientID + ". Name: " + firstName + " " + lastName + 
				".\nPhone Number: " + phoneNum + ". Email: " + email + "\nDate of birth: " + dateBirth + ". Gender: " + gender;
				
	}
	
}
