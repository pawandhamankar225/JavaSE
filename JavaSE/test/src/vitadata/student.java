package vitadata;

public class student {

	private int rollno;
	private String name,address,qual;
	public student(int rollno, String name, String address, String qual) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.qual = qual;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getQual() {
		return qual;
	}
	
	
}
