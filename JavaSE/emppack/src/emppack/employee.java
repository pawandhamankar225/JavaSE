package emppack;

class Emp
{
private String name,des;
private double salary;
double i=12;
void emp()
{
System.out.println("enter information");	
}
void emp(double i)
{
	i=i*salary;
	System.out.println("package/ctc"+i);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDes() {
	return des;
}

public void setDes(String des) {
	this.des = des;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}


}

public class employee
{
	public static void main(String args[])
	{
		
		Emp s1=new Emp();
		s1.setName("sumit");
		s1.setDes("Dev");
		s1.setSalary(1000000);
		
		
	}

}
