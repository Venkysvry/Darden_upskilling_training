package inhertainceConcept;

public class Example1 {

	public static void main(String[] args) {
	x x1=new x();
    x1.getCity();
	}

}

class x extends y{
	private int id;
	private String name;
	private String email;
	public x(int id, String name, String email,String city, String state) {
		super(city, state);
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public x() {}
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
class y{
	private String city;
	private String state;
	public y(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public y() {}
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