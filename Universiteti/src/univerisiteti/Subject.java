package univerisiteti;
import java.util.ArrayList;
import java.util.List;

/**
* Create a class called Subject to represent a student of school.
* A Subject should have the following information as instance variables:
* id – unique – type int
* name – type String
* teacher – type Teacher
* student list - List<Student> A subject is followed by many students
*/
public class Subject {
private Integer id;
private String name;
private Teacher teacher;
static final List<Integer> SUBJECTIDLIST= new ArrayList<>();
private List<Student1>studentList= new ArrayList<>();
 public Subject(Integer id,String name) {
	 setId(id);
     setName(name);
 }
/**
 * @return the id
 */
public Integer getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Integer id) {
	if(id<=0) throw new IllegalArgumentException("error,Id is negative");
	if(SUBJECTIDLIST.contains(id)) throw new IllegalArgumentException("Error,Id"+id+"exists");
	else {
		SUBJECTIDLIST.add(id);
	}
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the teacher
 */
public Teacher getTeacher() {
	return teacher;
}
/**
 * @param teacher the teacher to set
 */
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
 public void addStudent(Integer student) {
	 if(Student1.STUDENTIDLIST.contains(student.getId()));
	 Teacher studentList = null;
	 ((List<Integer>) studentList).add(student);
 }
 public List<Student1> getStudents() {
	 return studentList;
 }
@Override
public String toString() {
	String output = String.format("Subject id:%d\nTeacher:",id,name,
			getTeacher().getName());
	
	// TODO Auto-generated method stub
	
	for (Student1 student :getStudents())
		output +="ID"+student.getId()+",Name:"+student.getName()+"\n";
		return output += "Subject followed by:\n";
}
 
}