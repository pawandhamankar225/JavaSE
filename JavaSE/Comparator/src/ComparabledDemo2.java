import java.util.*;
class Vita implements Comparable<Vita>
{
	private int prnno;
	private String name;
    public int getPrnno() {
		return prnno;
	}


	public String getName() {
		return name;
	}
	
	
    

	@Override
	public String toString() {
		return "Vita [prnno=" + prnno + ", name=" + name + "]";
	}


	public Vita(int prnno, String name) {
		super();
		this.prnno = prnno;
		this.name = name;
	}


	@Override
	public int compareTo(Vita o) {
		// TODO Auto-generated method stub
		if(prnno>o.prnno )
	    return 1;
	   
		else if(prnno<o.prnno)
		return -1;
		
		else
		return 0;
		
	
	
	
}
}
public class ComparabledDemo2 {
	public static void main(String[] args) {
		
		List<Vita> list=new ArrayList<Vita>();
		list.add(new Vita(123,"Prathamesh"));
		list.add(new Vita(111,"Sumit"));
		list.add(new Vita(14,"Ajay"));
		Collections.sort(list);
		System.out.println(list);
	}

	
}


