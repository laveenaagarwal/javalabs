package lab;

public class entry {
	 
     public static void main(String[] args){
	
		Employee e = null;
		City c = new City ("Jaipur");
		Country co = new Country("INDIA",c);
		//co.setCity(c)
	    Address ad = new Address("23",co);
	    //ad.setCountry(co);
	    e = new Employee("Laveena",ad);
	    //e.displayDetails();
	    
	    System.out.print("\tName: "+ e.getName() );
 		System.out.println("\tAddress: "+ e.getAddress().getLine());
 		System.out.println("Country: "+ e.getAddress().getCountry().getName());
 		
 		System.out.println("City: " + e.getAddress().getCountry().getCity().getName());
 		System.out.println("-----------------");
	}
}

