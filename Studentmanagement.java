import java.util.*;
class Student
{
	int id;
	String name;
	long cont;
	String add;
	education edu;
	Mock mock;
	
	Student (int id, String name, long cont, String add, education edu, Mock mock)
	{
		this.id= id;
		this.name=name;
		this.cont=cont;
		this.add=add;
		this.edu=edu;
		this.mock=mock;
	}
	public void displaystudent()
	{
		System.out.println("Id: "+id+", Name:  "+name+ ", Contact:  "+cont+", Address: "+add);
		edu.displayeducation();
		mock.displaymock();
	}
}
class education
{
	String higheredu;
	String stream;
	int yop;
	double cgpa;
	education (String higheredu, String stream, int yop, double cgpa)
	{
		this.higheredu=higheredu;
		this.stream= stream;
		this.yop=yop;
		this.cgpa=cgpa;
		
	}
	public void displayeducation()
	{
		System.out.println("Higher education:  "+ higheredu+", Stream: " +stream+", yop:  "+yop+" , CGPA: "+cgpa);
		
	}
}
class Mock
{
	String subject;
	String comm;
	String tech;
	
	Mock(String subject, String comm, String tech)
	{
		this.subject= subject;
		this.comm= comm;
		this.tech= tech;
	}
	public void displaymock()
	{
		System.out.println("subject: "+subject+", Comm: "+comm+", Tech: "+tech);
	}
}
class Studentmanagement
{
	static ArrayList<Student>listStudent= new ArrayList();
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		for(; ;)
		{
			System.out.println("**********welcome to student management system***********");
			System.out.println();
			System.out.println("1. Add Student");
			System.out.println("2. View Student");
			System.out.println("3. Remove Student");
			System.out.println("4. Logout");
			System.out.println("Enter an option");
			int opt= sc.nextInt();
			switch(opt)
			{
				case 1: addStudent(); break;
				case 2: viewStudent(); break;
				case 3: removeStudent(); break;
				case 4: System.exit(0);
				default: System.out.println("Wrong Option");
			}
		}
	}
	public static void viewStudent()
	{
		System.out.println("All student Details");
		System.out.println("");
		for(Student s: listStudent)
		{
			s.displaystudent();
			System.out.println();
		}
	}
	public static void removeStudent()
	{
		System.out.println("will imp in future");
	}
	public static void addStudent()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Student personal details");
		System.out.println("ID:  ");
		int id= sc.nextInt();
		sc.nextLine();
		System.out.println("Name:  ");
		String name= sc.nextLine();
		System.out.println("Contact:  ");
		long cont= sc.nextLong();
		sc.nextLine();
		System.out.println("Address:  ");
		String add= sc.nextLine();
		System.out.println("");
			System.out.println("Education Details:   ");
			System.out.println("HigherEdu:   ");
			String higheredu= sc.next();
			System.out.println("Stream:  ");
			sc.nextLine();
			String stream= sc.nextLine();
			System.out.println("Yop:   ");
			int yop= sc.nextInt();
			System.out.println("CGPA:   ");
			double cgpa= sc.nextDouble();
			education edu= new education(higheredu, stream, yop, cgpa);
			System.out.println();
			System.out.println("Mock Details");
			System.out.println("Subject:  ");
			sc.nextLine();
			String subject= sc.nextLine();
			System.out.println("Communication:  ");
			String comm= sc.next();
			System.out.println("Technical: ");
			String tech= sc.next();
			Mock mock= new Mock(subject, comm, tech);
			Student s= new Student(id, name, cont, add, edu, mock);
			listStudent.add(s);
	}
	
}