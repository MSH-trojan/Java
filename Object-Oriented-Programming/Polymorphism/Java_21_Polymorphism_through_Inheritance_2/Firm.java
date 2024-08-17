package firm;

public class Firm {
	   public static void main (String[] args)   {
	      StaffMember[] staffList = new StaffMember[6];
	      staffList[0] = new Executive ("Sam", "123 Main Line", "555-0469", "123-45-6789", 1923.07);
	      staffList[1] = new Employee ("Carla", "456 Off Line", "555-0101", "987-65-4321", 846.15);
	      staffList[2] = new Employee ("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 769.23);
	      staffList[3] = new Hourly ("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 8.55);
	      staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.", "555-8374");
	      staffList[5] = new Volunteer ("Cliff", "321 Duds Lane", "555-7282");
	      ((Executive)staffList[0]).awardBonus (5000.00);  
	       ((Hourly)staffList[3]).addHours (40);
	 // Casting is needed because the base class reference has to see the whole derived class object
	      double amount;
	      for (int count=0; count < staffList.length; count++)      {
	         System.out.println (staffList[count]);
	         amount = staffList[count].pay();           // polymorphism
	         if (amount == 0.0)   System.out.println ("Thanks!");
	         else    System.out.println ("Paid: " + amount);
	         System.out.println ("-----------------------------------");
	      }     
	}    } 

abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
    public StaffMember (String n, String a, String p)   {
       name = n;  address = a;   phone = p;
    }
    public String toString () {
       return "Name: " + name + "\n" + "Address: " + address + "Phone: " + phone;
    }
    public abstract double pay();  // this must be implemented by derived classes
}
 class Volunteer extends StaffMember {
    public Volunteer (String name, String address, String phone)   {
       super (name, address, phone);
    }
    public double pay()   {  return 0.0;   }
 }
 class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;   
    public Employee (String name, String address, String phone, String sSN, double payRate) {  
       super (name, address, phone);
       this.socialSecurityNumber = sSN;
       this.payRate = payRate;
    }
    public String toString ()   {
       String result = super.toString();
       result += "\nSocial Security Number: " + socialSecurityNumber;
       return result;
    }
    public double pay ()   { return payRate;    }
}
 class Executive extends Employee {
	   private double bonus;
	   public Executive (String name, String address, String phone,  String sSN, double payRate){
	      super (name, address, phone, sSN, payRate);
	      bonus = 0;  // bonus has yet to be awarded
	   }
	   public void awardBonus (double execBonus)   {
	      bonus = execBonus;
	   }
	    public double pay ()   {
	      double payment = super.pay() + bonus; // could also use payRate as it is protected 
	      bonus = 0;                            // in Employee
	      return payment;
	   }
	}
	class Hourly extends Employee{
	   private int hoursWorked;
	   public Hourly (String name, String address, String phone, String sSN, double payRate) {
	      super (name, address, phone, sSN, payRate);
	      hoursWorked = 0;
	   }
	   public void addHours (int moreHours)   {
	      hoursWorked += moreHours;
	   }
	   public double pay ()   {
	      double payment = payRate * hoursWorked;
	      hoursWorked = 0;
	      return payment;
	   }
	   public String toString ()   {
	      String result = super.toString();
	      result += "\nCurrent hours: " + hoursWorked;
	      return result;
	   }
	}

