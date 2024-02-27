package univerisiteti;
import java.util.ArrayList;
import java.util.List;

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
//Lista e Id se mesuesve duhet te mbaje vlera unike
 static final List<Integer> TEACHERIDLIST= new ArrayList<>();


//konstruktori me parametra
public Teacher(int id,String name,double salary) throws Exception {
	setId(id);
	setName(name);
	setSalary(salary);
	
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 * @throws Exception 
 */
public void setId(int id) throws Exception {
	if(id<=0) throw new IllegalArgumentException("Error,negative id");
	if(TEACHERIDLIST.contains(id)) throw new IllegalArgumentException("Erorr,id" + id +" ekziston");
	else {
		TEACHERIDLIST.add(id);
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
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 * @throw IllegalArumentException when salary<0
 */
public void setSalary(double salary) {
	if(salary<0) throw new IllegalArgumentException("Error,nenegative salary");
	this.salary = salary;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return 	String.format("Id: %d\nName:%s\nSalary:%.2f",id,name,salary);
}

	
}


