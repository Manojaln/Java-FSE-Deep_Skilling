package mvc.data;

public class MVCTestMain {
	public static void main(String[] args) {
		// Step 1: Creating Model
        Student student = new Student("Alan", 22 , "A");
        // Step 2: Creating View
        StudentView view = new StudentView();
        // Step 3: Creating Controller
        StudentController controller = new StudentController(student, view);
        // Step 4: Display Initial Details
        controller.updateview();

        // Step 5: Update Model Data
        System.out.println("Data after Updation");
        controller.setStudentname("Manoj");
        controller.setStudentgrade("A+");

        // Step 6: Displaying Updated Details
        controller.updateview();
    }
}
