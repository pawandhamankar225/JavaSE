
class item {
String itemid;
String name;
int cost;
public item(String itemid, String name, int cost) {
	super();
	this.itemid = itemid;
	this.name = name;
	this.cost = cost;
}


void display()
{
	System.out.println("Name:"+" "+name+"\n"+"ItemId:"+" "+itemid+"\n"+"Cost: "+cost);
}
}
public class products
{
	public static void main(String args[])
	{
		item a= new item("15105","Gooday",50);
		a.display();
	}
}
