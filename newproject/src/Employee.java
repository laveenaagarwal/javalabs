import static java.lang.System.out;
import java.util.Date;
 class Dateof{
	int day,month,year;

public Dateof(int day,int month,int year){
	this.day=day;
	this.month=month;
	this.year=year;
}}
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
Dateof dt;
//this.d=dt; 

this.sal=sal;
id= ++count;
}
public void displayDetails()
{
	System.out.print("\tfirstName: "+ fnm);
		System.out.println("\tlastname: "+ lnm);
		System.out.print("grade: "+ gr);
		System.out.println("\tjoinmonth: "+ d );
		System.out.print("salary: "+ sal);
		System.out.print("\tdisplay id"+ id);
		//System.out.println("\tPinCode: "+ pinCode);
}

}		