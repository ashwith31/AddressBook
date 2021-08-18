package com.addressBook;

public class Contacts {

	    //variables
	    private String firstName;
	    private String lastName;
	    private String address;
	    private String city;
	    private String state;
	    private long phoneNumber;
	    private int zip;
		/*
		 * Using a constructor to set the values to the variables.
		 */
	    public Contacts(String firstName, String lastName, String address, String city, String state, long phoneNumber, int zip) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.phoneNumber = phoneNumber;
	        this.zip = zip;
	    }
	    /*
	     * Using Getters and Setters to get and set the values
	     */
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

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public long getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(long phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public int getZip() {
	        return zip;
	    }

	    public void setZip(int zip) {
	        this.zip = zip;
	    }

	    @Override
	    public String toString() {
	        return  "First Name='" + firstName + '\'' +", Last Name='" + lastName + '\'' +", Address='" + address + '\'' +
	                ", City='" + city + '\'' +", State='" + state + '\'' +", Phone Number=" + phoneNumber +", ZIP=" + zip;
	    }
	}


