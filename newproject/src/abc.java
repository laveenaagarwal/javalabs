import static java.lang.System.out;
import java.util.Date;
class abc{
public static void main(String[] args){
       	Employee e = null;
   
		
		Date dt = new Date();
		out.println("Current date: "+ dt);
		
		                e = new Employee("Laveena","Agarwal","A",dt,25000);
	             	//count=count+1;
			            e.displayDetails();
                        e = new Employee("niharika","Agarwal","A",dt,30000);
                              //count=count+1;
                        e.displayDetails();
                        e = new Employee("anita","Agarwal","A",dt,30000);
                             //count=count+1;
                        e.displayDetails();
}}
		