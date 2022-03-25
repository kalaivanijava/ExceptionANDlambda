package exception.finish;
interface Cabb
{
	public void book(String s,String d);
}


/*class Olaa implements Cabb
{
	public void book(String s,String d)
	{
		System.out.println(" booked from "+s+" to  "+d);
		
	}
	
}*/


public class LambdaString { 
	public static void main(String[] args)
	{
		Cabb c=(s,d)->{
			System.out.println(" booked  from "+s+" to "+d);
			};
			
		c.book("Salem", "Chennai");
		//System.out.println(s)
		//Cabb c=new Olaa();
		//c.book("chennai", "Salem");
	
		
		
	}

}
