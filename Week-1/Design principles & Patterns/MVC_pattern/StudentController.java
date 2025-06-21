package mvc.data;

public class StudentController {
	//create reference for the student and studentview class
	private Student model;
    private StudentView view;
    //generating constructor 
	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
    //Updating actual values of the variable present in the model class i,e student class
	public void setStudentname(String name) {
		model.setName(name);
	}
	public void setStudentid(int id) {
		model.setId(id);
	}
	public void setStudentgrade(String grade) {
		model.setGrade(grade);
	}
	//Updating view
	public void updateview() {
		 view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
	}
}
