import java.io.*;
		class demo{
		  void msg()throws Exception
		{ int a=5/0;
		System.out.println("parent");
		}
		}

		class TestExceptionChild5 extends demo{
		  void msg(){System.out.println("child");}

		  public static void main(String args[]){
		   demo p=new TestExceptionChild5();
		   try{
		   p.msg();
		   }catch(Exception e){}
		  }
		}

	