# Java_21_Inh_2

Write a Java program using the classes Student and Undergraduate (extended from Student).  

The constructor of Student has 2 parameters:  _name and a long student number_, 

while the constructor of Undergraduate has 4 parameters: _name, number, major program and year_ of studies.  

Both classes have the method _toString()_ and the method: _public double calculateFees(double courseload)_, which returns the fees to be paid by the student depending on his/her course load.

Suppose that for students generally, the fees are $800/course, and that for undergraduates, there is an additional incidental charge of $100 for first year students and $150 for students in later years.

Create a Student object with the name “Mary" and the number 202345678 and an Undergraduate object with the name “John”, the number 201234567,  the ITEC program and in the 1st year.

For each object display the String produced by the _toString()_ method and the double produced by the _calculateFees()_ method for 4.5 course load.

Finally use a reference of Student type to point to the Undergraduate object and use that reference to display the Undergraduate object. 

