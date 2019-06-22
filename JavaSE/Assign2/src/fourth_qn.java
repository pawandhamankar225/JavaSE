class top1
{
	void disp()
	{
		System.out.println("In top1");
	}
}
class bottom1 extends top1
{
	void disp()
	{
		System.out.println("In bottom 1");
	}
}
class bottom2 extends top1
{
	void disp()
{
	System.out.println("In bottom 2");
}
	
}
class bottom3 extends top1
{
	void disp()
	{ super.disp();
		System.out.println("In bottom 3");
	}
}

public class fourth_qn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  top1 n=new bottom3();
   n.disp();
	}

}
