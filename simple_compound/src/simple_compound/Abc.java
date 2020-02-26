package simple_compound;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Abc {
	public static void main(String args[])
	 {
	  Simple s= new Simple();
	  int a= s.si(1000,15,20);

	  Logger logger= Logger.getLogger(Abc.class.getName());

	  logger.log(Level.INFO,"The simple interest is "+a);

	  Compound c= new Compound();
	   c.ci(1000,15,10,6);

	  
	 }
}
