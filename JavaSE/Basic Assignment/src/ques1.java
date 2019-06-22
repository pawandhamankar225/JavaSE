import java.util.*;
public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no of elements you want to enter");
  n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter the elements");
  for(int i=0;i<n;i++)
  {
	  a[i]=sc.nextInt();
  }
		sort(a);
		
	}
  static void sort(int a[])
  {
	  int temp;
	  for(int i=0;i<a.length-2;i++)
	  {
		  for(int j=i+1;j<=a.length-1;j++)
		  {
			  if(a[i]>a[j])
			  {
			  temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
		      }
			  
	       }
    }
	  
	 System.out.println("The sorted array is :");
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.println(a[i]);
	  }
	  
	
  }
}


