package com.balihoo.rescuelink.model;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Someone who has stayed or is staying at the mission and information about them.
 */
public class Guest {

	// Identifying
	private String firstName = "";
	private String lastName = "";
	private String middleName = "";
	private String ssn = "";

	// Bio
	private DateTime dob;
	private Boolean veteran;
	private Boolean usCitizen;
	private Boolean employed;
	private Boolean unableToWork;
	private Boolean hasId;
	private Boolean parole;
	private Boolean ownsCar;
	private AddressVague whereBorn;
	private AddressVague lastResidedIn;
	private DateTime birthYearEstimate;
	private enum incomeFrequency {WEEKLY, MONTHLY}
	private int incomeAmount;
	private String medications = "";
	private String medicalCondition = "";
	private String allergies = "";
	private Contact emergencyContact;

	// Physical description
	private enum gender {MALE, FEMALE};
	private String race; // enum?
	private String height = ""; // We could do these more strictly, but it seems that a string allows for different locales without
	private String weight = ""; // difficulty and I can't think of needing to do anything programmatically with them.
	private String hairColor = "";
	private String eyeColor = "";

	// Mission history
	private ArrayList<DateTime> arrivalDates;  // We should do this different. Leaving it here to remind me later.
	private ArrayList<DateTime> departureDates;
	private String comments = "";
	private enum maritalStatus {MARRIED, SINGLE, DIVORCED, WIDOWER, WIDOW}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public DateTime getDob() {
		return dob;
	}

	public void setDob(DateTime dob) {
		this.dob = dob;
	}

	public Boolean getVeteran() {
		return veteran;
	}

	public void setVeteran(Boolean veteran) {
		this.veteran = veteran;
	}

	public Boolean getUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(Boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

	public Boolean getEmployed() {
		return employed;
	}

	public void setEmployed(Boolean employed) {
		this.employed = employed;
	}

	public Boolean getUnableToWork() {
		return unableToWork;
	}

	public void setUnableToWork(Boolean unableToWork) {
		this.unableToWork = unableToWork;
	}

	public Boolean getHasId() {
		return hasId;
	}

	public void setHasId(Boolean hasId) {
		this.hasId = hasId;
	}

	public Boolean getParole() {
		return parole;
	}

	public void setParole(Boolean parole) {
		this.parole = parole;
	}

	public Boolean getOwnsCar() {
		return ownsCar;
	}

	public void setOwnsCar(Boolean ownsCar) {
		this.ownsCar = ownsCar;
	}

	public AddressVague getWhereBorn() {
		return whereBorn;
	}

	public void setWhereBorn(AddressVague whereBorn) {
		this.whereBorn = whereBorn;
	}

	public AddressVague getLastResidedIn() {
		return lastResidedIn;
	}

	public void setLastResidedIn(AddressVague lastResidedIn) {
		this.lastResidedIn = lastResidedIn;
	}

	public DateTime getBirthYearEstimate() {
		return birthYearEstimate;
	}

	public void setBirthYearEstimate(DateTime birthYearEstimate) {
		this.birthYearEstimate = birthYearEstimate;
	}

	public int getIncomeAmount() {
		return incomeAmount;
	}

	public void setIncomeAmount(int incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

	public String getMedications() {
		return medications;
	}

	public void setMedications(String medications) {
		this.medications = medications;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public Contact getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(Contact emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public ArrayList<DateTime> getArrivalDates() {
		return arrivalDates;
	}

	public void setArrivalDates(ArrayList<DateTime> arrivalDates) {
		this.arrivalDates = arrivalDates;
	}

	public ArrayList<DateTime> getDepartureDates() {
		return departureDates;
	}

	public void setDepartureDates(ArrayList<DateTime> departureDates) {
		this.departureDates = departureDates;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
