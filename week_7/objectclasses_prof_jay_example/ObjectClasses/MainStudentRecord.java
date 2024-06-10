package ObjectClasses;
 
public class MainStudentRecord {
 
	public static void main(String[] args) {
		Student StudAObj = new Student();
		Student StudBObj = new Student();
		Degree D = new Degree();
		Degree D1 = new Degree();
		Courses C = new Courses();
		
		
		
		StudAObj.StudentID = 202401;
		D.Deg = "BSCS";
		C.courseCode = 202;
		C.CourseName = "Intermediate Programming";
		StudAObj.FirstName = "Roland";
		StudAObj.MiddleName = "Tom";
		StudAObj.LastName = "Reyes";
		StudAObj.Age = 34;
		
		System.out.println(StudAObj.StudentID);
		System.out.println(D.Deg);
		System.out.println(C.courseCode);
		System.out.println(C.CourseName);
		System.out.println(StudAObj.FirstName);
		System.out.println(StudAObj.MiddleName);
		System.out.println(StudAObj.LastName);
		System.out.println(StudAObj.Age);
		
		System.out.println("=============");
		StudBObj.StudentID = 202402;
		D1.Deg = "BSIT";
		StudBObj.FirstName = "Michael";
		StudBObj.MiddleName = "Santos";
		StudBObj.LastName = "Lopez";
		StudBObj.Age = 18;
		System.out.println(StudBObj.StudentID);
		System.out.println(D1.Deg);
		System.out.println(StudBObj.FirstName);
		System.out.println(StudBObj.MiddleName);
		System.out.println(StudBObj.LastName);
		System.out.println(StudBObj.Age);
 
	}
 
}