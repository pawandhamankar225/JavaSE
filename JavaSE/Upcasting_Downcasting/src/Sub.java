 //Upcasting Example
/*class Super {                    
   void Sample() {
      System.out.println("method of super class");
   }
}

public class Sub extends Super {
   void Sample() {
      System.out.println("method of sub class");
   }
   
   public static void main(String args[]) {
      Super obj = new Sub(); 
      obj.Sample();
   }
}

*/

//Downcasting
class Super {                                                    
   void Sample() {
      System.out.println("method of super class");
   }
}

public class Sub extends Super {
   void Sample() {
      System.out.println("method of sub class");
   }
 void sample2()
 {
	 System.out.println("Another method of sample class");
 }
   public static void main(String args[]) {
      Super obj = new Sub();
      //obj.sample2();                               //Will give an error because Super does not contain sample2 method and the method is overidden hence typecasting is required
      Sub sub = (Sub)obj;                        
      sub.Sample();
      
   }
}
