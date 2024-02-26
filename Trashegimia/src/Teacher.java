/**
* Create a class called Teacher that represents a teacher of school.
* A Teacher should have the following information as instance variables:
* id – unique – type int
* name – type String
* salary – type double
* @author Ajni
*/
public class Teacher {
 private int id;
private String name;
private double salary;
//konstruktori pa parametra i klases Teacher
public Teacher() {
	
}
//konstruktori me parametra
public Teacher(int id,String name,double salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
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
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}

}
