# Java_21_Polymorphism_through_Inheritance_2

In this driver one creates an array of 6 StaffMembers objects.

The first an Executive, with the name “Sam”, address “123 Main Line”, phone “555-0469”, social insurance number “123-45-6789” and salary 1923.07.

The second and third are Employees and the fourth an Hourly. 

These 3 objects have the same constructor type parameters as the Executive, but the Hourly the last parameter is the salary per hour.

The last two are Volunteers, who have only name, address and phone number.

Next the driver uses the method awardBonus() to give the Executive a $5000 bonus and the method addHours() to enter 40 hours for the Hourly object; his/her salary will be calculated as the product between the number of hours and the salary per hour.

The last part of the driver contains a loop in which for each object the method toString() will display the existing all information without salary.

This information will be followed by the message “Paid:” and the salary produced polymorphically by method pay(). 

For the Volunteers, who have no salary, there will be a “Thanks!” message.

Inside the code of Firm.java we have the methods addBonus() used by subclass Executive and addHours() used by subclass Hourly.  

Method  addBonus() uses the class variable bonus while addHours() uses the class variable hoursWorked.   
Why are those variables set to zero ?

The reason is that these class variables get their initial values zero from the constructors and only later in the program through the two methods mention above. 

If those methods are not used in main() we want those two class variables to be zero, when used in the pay() method.


