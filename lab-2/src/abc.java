import static java.lang.System.out;

//import date.Employee;

//import java.util.Date;
class abc{
public static void main(String[] args){
       	Employee e = null;
   
		
		Dateof dt = new Dateof(22,10,2017);
		//out.println("Current date: "+ dt);
		
		                e = new Employee("Laveena","Agarwal","A",dt,25000);
	             	
			            e.displayDetails();
			            //dt.displayDate();
			            
			            dt = new Dateof(20,10,2017);
                        e = new Employee("niharika","Agarwal","A",dt,30000);
                    
                        e.displayDetails();
                        //dt.displayDate();
                        
                        dt = new Dateof(19,10,2017);
                        e = new Employee("anita","Agarwal","A",dt,30000);
                        e.displayDetails();
                        //dt.displayDate();
}}
		