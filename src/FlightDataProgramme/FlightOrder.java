package FlightDataProgramme;

public class FlightOrder {

	private String flightNum;
	private String depLoc;
	private String arrLocValidTill;
	private String flightTime;
	private String flightDurn;
	private String fare;

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getDepLoc() {
		return depLoc;
	}

	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}

	public String getArrLocValidTill() {
		return arrLocValidTill;
	}

	public void setArrLocValidTill(String arrLocValidTill) {
		this.arrLocValidTill = arrLocValidTill;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public String getFlightDurn() {
		return flightDurn;
	}

	public void setFlightDurn(String flightDurn) {
		this.flightDurn = flightDurn;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "FlightOrder [flightNum=" + flightNum + ", depLoc=" + depLoc + ", arrLocValidTill=" + arrLocValidTill + ", flightTime=" + flightTime
				+ ", flightDurn=" + flightDurn + ", fare=" + fare + "]";
	}
}
