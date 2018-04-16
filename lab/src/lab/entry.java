package lab;

public class entry {
	 
     public static void main(String[] args){
	
		Employee e = null;
		City c = new City ();
		c.setName("Jaipur");
		//Country co = new Country("INDIA",c);
		Country co = new Country();
		co.setName("INDIA");
	     co.setCity(c);
	    Address ad = new Address();
	    ad.setLine("Vaishali Name");
	     ad.setCountry(co);
	    //e = new Employee("Laveena",ad);
	     e = new Employee();
	     e.setName("Laveena");
	     e.setAddress(ad);
	    //e.displayDetails();
	    
	    System.out.print("Name: "+ e.getName() );
 		System.out.println("Address: "+ e.getAddress().getLine());
 		System.out.println("Country: "+ e.getAddress().getCountry().getName());
 		
 		System.out.println("City: " + e.getAddress().getCountry().getCity().getName());
 		System.out.println("-----------------");
	}
}

