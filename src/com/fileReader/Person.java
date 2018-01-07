package com.fileReader;

public class Person {

	private Long id;
	private String first_name;
	private String last_name;
	private String pan;
	private int pin;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}