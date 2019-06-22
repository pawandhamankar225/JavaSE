 interface Game
 {
	abstract void play(); 
 }
 
 class Cricket implements Game
 {
	 public void play()
	 {
		 System.out.println("Playing Cricket");
	 }
 }
 class Football implements Game
 {
	 public void play()
	 {
		 System.out.println("Playing Football"); 
	 } 
 }
 
 class Tennis implements Game
 {
	 public void play()
	 {
		 System.out.println("Playing Tennis");
	 }
 }
 
public class ques9 {
	static void perform(Game ref)
	 {
		ref.play(); 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 perform(new Cricket());
		 perform(new Football());
		 perform(new Tennis());
	}

}
