package exception.finish;

interface Calculate
{
	public String add(int a,int b);
}
/*class Addtion implements Calculate
{
	public int add(int a,int b)
	{
		System.out.println(" Addtion ");
		return a+b;
	}
}*/

public class LamdaReturn
{
	public static void main(String[] args)
	{
  Calculate c=(a,b)->{return "Add "+a+" and "+b+" ="+(a+b);};
     
  System.out.println(c.add(5, 5));
  Calculate l=(a,b)->{return " Product of "+a+" And "+b+" ="+(a*b);};
  System.out.println(l.add(5, 5));
  
}
}
