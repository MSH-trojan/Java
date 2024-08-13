package inh_1;

public class Inh_1{
	public static void main(String[] args) {
		
		
		Student s1 = new Student("Mark" , 220907852);
		Undergrad s2 = new Undergrad("Mary" , 220908952 , "Business" , 2018);
		
		
		
		System.out.println("s1 is " + s1.getName());
		System.out.println(s1.toString());
		
		System.out.println();
		
		System.out.println("s2 is " + s2.getName());
		System.out.println(s2.toString());
		
		s2.setName("Isabella");
		s2.setNumber(220909952);
		
		System.out.println("S2 started in the year " + s2.getYear());
		System.out.println();
		
		System.out.println(s2.toString());
		
		
	}
}




 class Student {
	private String name;
	private int number;
	
	public Student(String aName, int aNumber) {
		name = aName;
		 number = aNumber;
	}
		 
	public void setName(String aName) {
		name = aName;
	}
	public void setNumber(int aNumber) {
		number = aNumber;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Student:  [s/he: " + name + "  with |number: " + number + " ]";
	}
	
	
	
	
	}


class Undergrad extends Student{
	private String major;
	private int year;
	
	Undergrad(String aName,int aNumber,String aMajor,int aYear){
		super(aName , aNumber);
		
		major = aMajor;
		year = aYear;
	}
	
	
	public void setMajor(String aMajor) {
		major = aMajor;
	}
	
	public void setYear(int aYear) {
		year = aYear;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getYear() {
		return year;
	}
	
	
	public String toString() {
		return "Undergrad Student:  [s/he: " + getName() + "  with |number: " + getNumber() + 
				"     |major: " + major + " |start year: " + year +  " ]";
	}}
	
	
	


