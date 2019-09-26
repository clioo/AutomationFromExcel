package utils;

public class User {

	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String password;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String username;
	public User(String ... registerInfo) {
		this.firstName = registerInfo[0];
		this.lastName = registerInfo[1];
		this.phone = registerInfo[2];
		this.email = registerInfo[3];
		this.password = registerInfo[4];
		this.address = registerInfo[5];
		this.city = registerInfo[6];
		this.state = registerInfo[7];
		this.postalCode = registerInfo[8];
	}
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
