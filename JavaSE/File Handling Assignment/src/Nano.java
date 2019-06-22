import java.io.*;

class Car //implements Serializable
{
	private String carname;

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	
	
}
public class Nano extends Car implements Serializable 
{
 private String ldate;

public String getLdate() {
	return ldate;
}

public void setLdate(String ldate) {
	this.ldate = ldate;
}
}
