package lab;

public class entry {
	 Employee e;
     public void displayDetails()
     {
    	
    	 System.out.print("\tName: "+ e.getName() );
 		System.out.println("\tAddress: "+ e.getAddress().getLine());
 		System.out.println("Country: "+ e.getAddress().getCountry().getName());
 		//System.out.println("\tjoinmonth: "+ d.getDay() );
 		System.out.println("City: " +  e.getAddress().getCountry().getCity().getName());
 		//System.out.print("\tjoinmonth: "+ d.getMonth());
 		//System.out.print("\tjoinmonth: "+ d.getYear());
 		System.out.println("--------------------------------------------");
 		//System.out.print("\tdisplay id"+ id);
    	 
     }
     public static void main(String[] args){
	
		Employee e = null;
		City c = new City ("Jaipur");
		Country co = new Country("INDIA",c);
		
	    Address ad = new Address("23",co);
	    
	    e = new Employee("Laveena",ad);
	    
		
	}
}

