package io_programming;

import java.io.Serializable;

public class Flight implements Serializable {
	
	private String flightNo; //NON-STATIC , NO SERIALIZATIOn // transient = provides serialization
	private String airLine;
	private String sourse;
	private String destination;

	public Flight() {
		// TODO Auto-generated constructor stub
	}
	
	public Flight(String flightNo, String airLine, String sourse, String destination) {
		super();
		this.flightNo = flightNo;
		this.airLine = airLine;
		this.sourse = sourse;
		this.destination = destination;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getAirLine() {
		return airLine;
	}

	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}

	public String getSourse() {
		return sourse;
	}

	public void setSourse(String sourse) {
		this.sourse = sourse;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", airLine=" + airLine + ", sourse=" + sourse + ", destination="
				+ destination + ", getFlightNo()=" + getFlightNo() + ", getAirLine()=" + getAirLine() + ", getSourse()="
				+ getSourse() + ", getDestination()=" + getDestination() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
