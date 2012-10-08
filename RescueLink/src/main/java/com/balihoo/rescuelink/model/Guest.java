package com.balihoo.rescuelink.model;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Someone who has stayed or is staying at the mission and information about them.
 */
public class Guest {

	// Identifying
	private String firstName;
	private String lastName;
	private String middleName;
	private String ssn;
	private enum maritalStatus {MARRIED, SINGLE, DIVORCED, WIDOWER, WIDOW}

	// Bio
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
	private String medications;
	private String medicalCondition;
	private String allergies;
	private Contact emergencyContact;

	// Physical description
	private enum gender {MALE, FEMALE};
	private String race; // enum?
	private String height; // We could do these more strictly, but it seems that a string allows for different locales without
	private String weight; // difficulty and I can't think of needing to do anything programmatically with them.
	private String hairColor;
	private String eyeColor;

	// Mission history
	private ArrayList<DateTime> arrivalDates;  // We should do this different. Leaving it here to remind me later.
	private ArrayList<DateTime> departureDates;
	private String comments;
}
