package exception.finish;

interface Saying
{
	public String say(String name);
}

public class LamdaJavapoint 
{
 public static void main(String[] args)
 {
	 Saying s=(name)->{return  "Hai ,"+name;};
	 System.out.println(s.say("kalai"));
	 Saying a=(name)->{return "Hello ,"+name;};
	 System.out.println(a.say("vani"));
	 Saying y=(name)->{return "Welcome ,"+name;};
	 System.out.println(y.say("kalaivani"));
 }
}
