
public class ad {
String id;
String title;
String city;
String pin;
String desp;
String email;
String phone;

public ad(String id, String title, String city, String pin, String desp, String email, String phone) {
	super();
	this.id = id;
	this.title = title;
	this.city = city;
	this.pin = pin;
	this.desp = desp;
	this.email = email;
	this.phone = phone;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public String getDesp() {
	return desp;
}
public void setDesp(String desp) {
	this.desp = desp;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

}
