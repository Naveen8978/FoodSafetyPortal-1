package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
	int noOfPersons;
	LocalTime time;
	LocalDate date;
	
	public Booking(int noOfPersons, LocalTime time, LocalDate date) {
		this.noOfPersons=noOfPersons;
		this.time=time;
		this.date=date;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
