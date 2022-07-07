import java.util.Scanner;
class StudentInformation
	{
		public static void main(String[] args)
		{
			System.out.println("STUDENT INFORMATION:");
			Scanner s=new Scanner(System.in);

			System.out.println("Enter Student unique 8 digit number as id:");
			int studentId=s.nextInt();
			
			System.out.println("Enter Student Name:");
			String studentName=s.next();
			
			System.out.println("Enter Student Mobile No:");
			long studentMobileNo=s.nextLong();

			System.out.println("Enter Student Age:");
			int studentAge=s.nextInt();

			System.out.println("Enter Student Gender(F/M):");
			char studentGender=s.next().charAt(0);

			System.out.println("Enter Student CGPA:");
			double studentCGPA=s.nextDouble();

			System.out.println("Enter Student Weight:");
			int studentWeight=s.nextInt();

			System.out.println("Enter Student Height:");
			double studentHeight=s.nextDouble();

			System.out.println("Enter Student Date Of Birthday:");
			String studentDateOfBirthday=s.next();

			System.out.println("Enter Student Year Of Student:");
			int studentYearOfStudent=s.nextInt();

			System.out.println("Enter Student Address:");
			String studentAddress=s.next();

			System.out.println("Enter Student Is Scholar(Y/N):");
			char studentIsScholar=s.next().charAt(0);

			System.out.println("Enter Student Degree Pursued:");
			String studentDegreePursued=s.next();


			System.out.println("Student unique 8 digit number as id:"+studentId);
			System.out.println("Student Name:"+studentName);
			System.out.println("Student Mobile No:"+studentMobileNo);
			System.out.println("Student Age:"+studentAge);
			System.out.println("Student Gender:"+studentGender);
			System.out.println("Student CGPA:"+studentCGPA);
			System.out.println("Student Weight:"+studentWeight);
			System.out.println("Student Height:"+studentHeight);
			System.out.println("Student Date Of Birthday:"+studentDateOfBirthday);
			System.out.println("Student Year Of Student:"+studentYearOfStudent);
			System.out.println("Student Address:"+studentAddress);
			System.out.println("Student Is Scholar:"+studentIsScholar);
			System.out.println("Student Degree Pursued:"+studentDegreePursued);
		}
	}