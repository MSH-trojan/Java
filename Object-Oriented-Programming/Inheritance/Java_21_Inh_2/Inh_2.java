package inh_2;

public class Inh_2 {
	public static void main(String[] args) {
		
		Student s1 = new Student("Mary", 202345678);
		
		Undergrad u1 = new Undergrad("John", 201234567, "ITEC", 1);
		
		System.out.println(s1 + " fees:  $" + s1.calculateFees(4.5));
		
		System.out.println();
		
		System.out.println(u1 + " fees:  $" + u1.calculateFees(4.5));
		
		System.out.println();
		
		 s1 = u1;
		
		System.out.println(s1 + " fees:  $" + s1.calculateFees(4.5));
		System.out.println();
	}
}

class Student{
	
	private String name;
	private long number;
	
	
	public Student(String aName, long aNumber){
 		name = aName;
		number = aNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public long getNumber() {
		return number;
	}
	
	public String toString(){
		return "Student[name=" + name + ", number=" + number + "]";
	}
	
	public double calculateFees(double courseload) {
		final double fee = 800;
		return fee * courseload;
	}
}

class Undergrad extends Student{
	
	private String major;
	private int year;
	
	public Undergrad(String aName, long aNumber , String aMajor , int aYear) {
		
		super(aName , aNumber);
		
		major = aMajor;
		year = aYear;
	}
	
	public String toString(){
		return "Undergrad[name=" + getName() + ", number=" + getNumber() + ", major=" + major + ", year=" + year + "]";
	}
	
	public double calculateFees(double courseload) {
		final double INCIDENTAL_FEE_Y1 = 100;
	    final double INCIDENTAL_FEE_Y_GT_1 = 150;

	    double fee = super.calculateFees(courseload);
	    if (year == 1)
	        fee += INCIDENTAL_FEE_Y1;
	    else
	        fee += INCIDENTAL_FEE_Y_GT_1;
	    return fee;
	}

}

