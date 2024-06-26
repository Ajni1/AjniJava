package Universiteti;

import java.util.ArrayList;
import java.util.List;

/**
* Creates a Subject to represent a subject of school.
* A subject has the following information as instance variables:
* id – unique – type int
* name – type String
* teacher – type Teacher A subject is taught by a teacher
* student list - List<Student>  A subject is followed by many students
*/
public class Subject {
private static final List<Integer> SUBJECTIDLIST = new ArrayList<>();
private Integer id;
private String name;
private Teacher teacher;
private List<Student> studentList = new ArrayList<>();

public Subject(Integer id, String name) {
	
	setId(id);
	setName(name);
}

/**
 * @return the id
 */
public Integer getId() {return id;}

/**
 * @param id the id to set
 */
public void setId(Integer id) {
	if(id<=0) throw new IllegalArgumentException("Error, ID negative!");
	if(SUBJECTIDLIST.contains(id))
		throw new IllegalArgumentException("Error, ID  " +id + " ekziston");
	else {
		SUBJECTIDLIST.add(id);
		this.id = id;
	}
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

public void addStudent(Student student) {
	if(!Student.STUDENTIDLIST.contains(student.getId()))
		studentList.add(student);
}

public List<Student> getStudents() { return studentList;}

@Override
public String toString() {
	String output = String.format("Subject id: %d\n Name: %s\n Teacher: %s\n", id, name,
			getTeacher().getName()
			);
	output += "The students of subject: \n";
	for(Student student: getStudents())
		output += "ID: " + student.getId() + ", Name:" + student.getName()+"\n";
	
	return output;
}

}
