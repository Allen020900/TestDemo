//Write a Java program that implements an interface Student 
//which has two methods displayGrade() and attendance().
//Implement two classes PG_Student and UG_Student with necessary inputs of data
interface Student
{
	public void displayGrade();
	public void attendance(int x);
}
class PG_Student implements Student
{
	int rno,att;
	String name,grade;
	PG_Student(int rno,String name,String grade)
	{
		this.rno=rno;
		this.name=name;
		this.grade=grade;
	}
	public void display()
	{
		System.out.println(" PG student name is:"+name);
		System.out.println(" PG student roll number is:"+rno);
	}
	public void displayGrade()
	{
			System.out.println(" PG student grade is:"+grade);
	}
	public void attendance(int att)
	{
		this.att=att;
		System.out.println(" PG student attendance is:"+att);
	}
}
class UG_Student implements Student
{
	int rno,att;
	String name,grade;
	UG_Student(int rno,String name,String grade)
	{
		this.rno=rno;
		this.name=name;
		this.grade=grade;
	}
	public void display()
	{
		System.out.println(" UG student name is:"+name);
		System.out.println(" UG student roll number is:"+rno);
	}
	public void displayGrade()
	{
			System.out.println(" UG student grade is:"+grade);
	}
	public void attendance(int att)
	{
		this.att=att;
		System.out.println(" UG student attendance is:"+att);
	}
}

class Driver1
{
	public static void main(String args[])
	{
		PG_Student pg=new PG_Student(501,"ram","A-grade");
		pg.display();
		pg.displayGrade();
		pg.attendance(80);
		
		UG_Student ug=new UG_Student(6601,"sach","O-grade");
		ug.display();
		ug.displayGrade();
		ug.attendance(90);
		
	}
}

	





