

class Predac {
    private int a;

  Predac(int a)
   {  this.a=a;
	 if(a<2000)
	 {
		 System.out.println("You are are elgible for the course");
	 }
	 else
	 {
		 System.out.println("You are not eligible...Better Luck next time");
	 }
	   
   }
	
}
class Dac {
	   
  void term1()
  {
	   System.out.println("Subjects in term 1");
	   System.out.println("OS");
	   System.out.println("Data Structure");
	   System.out.println("Web designing");
	   
  }
  
 void term2()
  {
	   System.out.println("Subjects in term 2");
	   System.out.println("OOPS with C++");
	   System.out.println("Java");
	   System.out.println("Spring Hibernate");
  }
}

class Basic {

	
void finaltest()
{
	System.out.println("Final test scheduled on Noveber 2019");
}
}
public class Student {
public static void main(String args[])
{
	Dac d=new Dac();
	d.term1();
	d.term2();
	Predac a=new Predac(2500);
	Basic b=new  Basic();
	b.finaltest();
}
}
