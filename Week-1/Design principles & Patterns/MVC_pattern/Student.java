package mvc.data;

public class Student {
	private String name ;
	private int id;
	private String grade ;
	//generating constructor
	public Student(String name, int id, String grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	// Generating getter setter methods directly in Eclipse IDE
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
