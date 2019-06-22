class Demo { 
void show() { 
	System.out.println("i am in show method of super class"); 
} 
} 

class Flavor1Demo 
{ 
public static void main(String[] args){ 
	Demo d = new Demo() { 
		void show() { 
			super.show(); 
			System.out.println("i am in Flavor1Demo class"); 
		 
}
};
d.show(); 
}
}