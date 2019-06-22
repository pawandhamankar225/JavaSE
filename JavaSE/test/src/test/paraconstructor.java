package test;
class vita1
{  
	private static String cname="Vidyanidhi Infotech Academy";
	
	
	public String getCname() {
		return cname;
	}
	public int rollno;
	private String Name,Add,edu;
	public int getRollno() {
		return rollno;
	}
	public vita1(int rollno, String name, String add, String edu) {
		super();
		this.rollno = rollno;
		Name = name;
		Add = add;
		this.edu = edu;
	}
	public int rollno()
  {
  return rollno;
  }
 
	
	public String getName() {
		return Name;
	}
	
	
	public String getAdd() {
		return Add;
	}
	
	public String getEdu() {
		return edu;
	}
	
}
public class paraconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     vita1 v1 = new vita1(1,"Prathamesh","BE","Thane");
     //  v1=null;
      // if(v1!=null)
    System.out.println(v1.getCname()+"\n"+v1.getRollno()+"\n" +v1.getName()+"\n"+v1.getAdd()+"\n"+ v1.getEdu());
  

	}
}
