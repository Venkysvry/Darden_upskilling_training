package inhertainceConcept;

public class Aggregation {

	public static void main(String[] args) {
		
		

	}

}
class z {
	private int id;
	private String name;
	private String email;
	private Address address;
	public z(int id, String name, String email ,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address=address;
	}
	public z() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

class Address {
	private String city;
	private String state;
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public Address() {}
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
	
}