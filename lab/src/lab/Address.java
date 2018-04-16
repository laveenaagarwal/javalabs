package lab;

public class Address {
  private String line;
  private Country country;
public String getLine() {
	return line;
}
public void setLine(String line) {
	this.line = line;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
 
public Address(String line,Country country){
	this.line = line;
	this.country = country;
	}

}
