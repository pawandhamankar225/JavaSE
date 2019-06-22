//1
/*class Outer { 
   // Simple nested inner class 
   class Inner { 
      public void show() { 
           System.out.println("In a nested class method"); 
      } 
   } 
} 
class MethodDemo { 
   public static void main(String[] args) { 
       Outer.Inner in = new Outer().new Inner(); 
       in.show(); 
   } 
} */

//2
/*class Outer { 
	public void outerMethod() { 
		System.out.println("inside outerMethod"); 
		// Inner class is local to outerMethod() 
		class Inner { 
			public void innerMethod() { 
				System.out.println("inside innerMethod"); 
			} 
		} 
		Inner y = new Inner(); 
		y.innerMethod(); 
	}	} 

class MethodDemo { 
	public static void main(String[] args) { 
		Outer x = new Outer(); 
		x.outerMethod(); 
	} 
} 
*/
//3
/*class Outer { 
   void outerMethod() { 
      int x = 98; 
      System.out.println("inside outerMethod"); 
      class Inner { 
         void innerMethod() { 
            System.out.println("x= "+x); 
         } 
      } 
      Inner y = new Inner(); 
      y.innerMethod(); 
   } 
} 
class MethodDemo { 
   public static void main(String[] args) { 
      Outer x=new Outer(); 
      x.outerMethod(); 
   } 
}*/

//4
/*class Outer { 
    static void outerMethod() { 
     System.out.println("inside outerMethod"); 
   } 
     
   // A static inner class 
   static class MethodDemo { 
     public static void main(String[] args) { 
        System.out.println("inside inner class Method"); 
        outerMethod(); 
     } 
   } 
  
}*/
