package SpringCore;

public class Address {
	int addId;
	String city;
	String state;
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", state=" + state + "]";
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
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
	public Address(int addId, String city, String state) {
		super();
		this.addId = addId;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
	}

}
