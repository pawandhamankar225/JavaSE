abstract class Shape
{
 abstract void draw();
}

class Tri extends Shape
{
 void draw()
 {
	 System.out.println("i am in Tri class");
	 
 }
 Tri()
 {
	 
	 System.out.println("i am in tri class constructor");
 }
}

class Rect extends Shape
{
 void draw()
 {
	 System.out.println("i am in Rect class"); 
	 
 }
 Rect()
 {
	 
	 System.out.println("i am in Rect class constructor");
 }
}

class Poly extends Shape
{
 void draw()
 {
	 
	 System.out.println("i am in Poly class");
 }
 Poly()
 {
	 
	 System.out.println("i am in Poly class constructor");
 }
}
public class ques5 {
	static void perform(Shape s)
	{
		s.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s[]= new Shape [3];
		s[0]=new Tri();
		s[1]= new Rect();
		s[2]= new Poly();
		for(int i=0;i<s.length;i++)
		{
			perform(s[i]);
		}
 
 
	}
}


