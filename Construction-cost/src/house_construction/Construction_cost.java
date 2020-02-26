package house_construction;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Construction_cost {
	 public static void main(String[] args) 
	 {
		 Scanner s= new Scanner(System.in);

		 Logger logger= Logger.getLogger(Construction_cost.class.getName());

		 logger.log(Level.INFO,"Enter total area of the house:");
		 int a= s.nextInt();
		 logger.log(Level.INFO,"write '1' for fully automated");
		 int fa= s.nextInt();
		 logger.log(Level.INFO,"Materials standard:\n"
			 		+ "1) Standard materials\n"
			 		+ "2) above standard materials\n"
			 		+ "3) high standard materials\n");
	          logger.log(Level.INFO,"Enter the material standard you want(1,2,3):");
                  int ms=s.nextInt();
		 int total;
		 switch(ms)
		 {
		 case 1 : total= 1200*a;
		      logger.log(Level.INFO,"Total construction cost by using standard materials is Rs"+total);
		      break;
		 case 2: total= 1500*a;
		      logger.log(Level.INFO,"Total construction cost by using above standard materials is Rs"+total);
		      break;
		 case 3:  
			 if (fa==1)
		     {
	          total=2500*a;
	          logger.log(Level.INFO,"Total construction cost by using high stadard materials and fully automated home is Rs"+total);
		     }
			 else
				logger.log(Level.INFO,"Total construction cost by using high stadard materials only is Rs"+1800*a);
			 break;
		 }
	 }
}
