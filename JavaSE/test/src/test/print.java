package test;
class vita
{
	private int rollno;
	private String Name,Add,edu;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
}
public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     vita v1=new vita();
     v1.setRollno(1);
     v1.setName("Prathamesh");
     v1.setEdu("BE");
     v1.setAdd("Thane");
     System.out.println(v1.getRollno()+"\n" +v1.getName()+"\n"+v1.getAdd()+"\n"+ v1.getEdu());
   

}
}
	