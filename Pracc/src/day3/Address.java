package day3;

public class Address {
	
	private String Sect;
	private String City;
	private String State;
	
	
	
	
	public Address() {}

	public Address(String sect, String city, String state) {
		super();
		Sect = sect;
		City = city;
		State = state;
	}

	public String getSect() {
		return Sect;
	}
	
	
	

	public void setSect(String sect) {
		Sect = sect;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	
	@Override
	public String toString() {
		return "Address [Sect=" + Sect + ", City=" + City + ", State=" + State + "]";
	}
	
	

}
