import static java.lang.System.out;
//import java.util.Date;
class Employee
{
private String fnm,lnm,gr;
Dateof d;
private int sal;
public static int count=0;
public int id;
 

public Employee(String fnm,String lnm,String gr,Dateof d,int sal){
this.fnm=fnm;
this.lnm=lnm;
this.gr=gr;

this.d=d; 

this.sal=sal;
id= ++count;
}
public void displayDetails()
{
	System.out.print("\tfirstName: "+ fnm);
		System.out.println("\tlastname: "+ lnm);
		System.out.print("grade: "+ gr);
		//System.out.println("\tjoinmonth: "+ d.getDay() );
		System.out.print("joining month: "+ d.getDay() +"."+ d.getMonth()  +"."+ d.getYear());
		//System.out.print("\tjoinmonth: "+ d.getMonth());
		//System.out.print("\tjoinmonth: "+ d.getYear());
		System.out.print("salary: "+ sal);
		System.out.print("\tdisplay id"+ id);
		
}

}		