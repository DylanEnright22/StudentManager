package ie.gmit.studentmanager;

public class StudentManager {
	
	// ARRAY // 
	private static final int INITIAL_CAPACTIY = 10;
	// create an array to hold the student objects //
	private Student[] students = null; 
	// CONSTRUCTOR INITIALIZES STUDENTS ARRAY ///
	public StudentManager() {
		students = new Student[INITIAL_CAPACTIY]; 
	}
	
	// Create methods you may need and stub them out // 
	
	public boolean add(Student student ) {
		return false; 
	}
	
	public  boolean delete(String studentId) {
		return false; 
	}
	
	public Student[] getStudentByFirstName(String firstName) {
		return null;
	}
	
	public int findTotalStudents() {
		return -1; 
	}
	
	
	
}
