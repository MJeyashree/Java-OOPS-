interface Displayed{
	void displayDetails();
}
abstract class Persons{
	private String name;
	private String department;
	private int rollNum;
	
	public Persons(String name,String department,int rollNum){
		this.name=name;
		this.department=department;
		this.rollNum=rollNum;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getDepartment(){
		return department;
	}
	public void setDepartment(String department){
		this.department=department;
	}
	
	public int getrollNum(){
		return rollNum;
	}
	public void setrollNum(int rollNum){
		this.rollNum=rollNum;
	}
}

class Student extends Persons implements Displayed{
	private int mark1;
	private int mark2;
	private int mark3;
	private double total;
	private String gradePoint;
	
	public Student(String name,String department,int rollNum,int mark1,int mark2,int mark3){
		super(name,department,rollNum);
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		calcGradeTotal();
	}
	
	private void calcGradeTotal(){
		total=mark1+mark2+mark3;
		double avg=total/3.0;
		if(avg >= 90) gradePoint="A+";
		else if(avg >= 80) gradePoint="A";
		else if(avg >= 70) gradePoint="B+";
		else if(avg >= 60) gradePoint="B";
		else if(avg >= 50) gradePoint="C";
		else  gradePoint="Fail";
    }
		
	@Override
	public void displayDetails(){
		System.out.println("-------------Student Detais--------------");
		System.out.println("Name : " + getName());
		System.out.println("Department:"  + getDepartment()); 
		System.out.println("Roll Number: " + getrollNum());
		System.out.println("Marks1: " + mark1);
		System.out.println("Marks2: " + mark2);
		System.out.println("Marks3: " + mark3);
		System.out.println("Total: " + (mark1+mark2+mark3));
		System.out.println("Grade Point is: " + gradePoint);
	}
}
	
class Teacher extends Persons implements Displayed{
	private double salary;
	private String subject;
		
	public Teacher(String name,String department,int rollNum,double salary,String subject){
		super(name,department,rollNum);
        this.salary=salary;
		this.subject=subject;
	}
	
	@Override
	public void displayDetails(){
		System.out.println("-------------Teacher Detais--------------");
		System.out.println("Name : " + getName());
		System.out.println("Department:"  + getDepartment()); 
		System.out.println("Roll Number: " + getrollNum());
		System.out.println("Salary : " + salary);
		System.out.println("Subject : " + subject);
    }
}

public class StudentMain{
	public static void main(String[] args){
		Displayed s1=new Student("Jeyashree","Cyber Security",111,98,95,97);
		s1.displayDetails();
		Displayed s2=new Student("Jeya","Cyber Security",112,89,90,87);
		s2.displayDetails();
		Displayed s3=new Student("Shree","Cyber Security",113,35,40,60);
		s3.displayDetails();
		Displayed t1=new Teacher("Raji","Cyber Security",201,75000,"Network Security");
		t1.displayDetails();
	}
}



***********************************************************************************OUTPUT********************************************************************************************
-------------Student Detais--------------
Name : Jeyashree
Department:Cyber Security
Roll Number: 111
Marks1: 98
Marks2: 95
Marks3: 97
Total: 290
Grade Point is: A+
-------------Student Detais--------------
Name : Jeya
Department:Cyber Security
Roll Number: 112
Marks1: 89
Marks2: 90
Marks3: 87
Total: 266
Grade Point is: A
-------------Student Detais--------------
Name : Shree
Department:Cyber Security
Roll Number: 113
Marks1: 35
Marks2: 40
Marks3: 60
Total: 135
Grade Point is: Fail
-------------Teacher Detais--------------
Name : Raji
Department:Cyber Security
Roll Number: 201
Salary : 75000.0
Subject : Network Security

	
