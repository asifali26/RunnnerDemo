package P1;

public class Employee {
	int EmployeeId;
	int age;
	double salary;
	double variablepay;
	

	public  void setEmployeeId (int EmployeeId)
	{ this.EmployeeId = EmployeeId ;}
	public int getEmployeeId()
	{ return this.EmployeeId;}

	public  void setage (int age)
	{ this.age = age ;}
	public int getage()
	{ return this.age;}

	public  void setsalary (double salary)
	{ this.salary = salary ;}
	public double getsalary()
	{ return this.salary;}

	public  void setvariablepay (double variablepay)
	{ this.variablepay = variablepay ;}
	public double getvariablepay()
	{ return this.variablepay;}

	public Employee()
	{ EmployeeId= 1235;
	}
	public Employee(int EmployeeId)
	{ this.EmployeeId=EmployeeId;
	System.out.println(this.EmployeeId);
	}

}
