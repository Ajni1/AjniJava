import java.util.List;
/**
* Create a class School that should include the following information as instance
variables:
* students – type List<Student>
* teachers – type List<Teacher>
* total money earned – type double
* total money spent – type double
* create a method addTeacher that adds a Teacher in the list
* create a method addStudent that adds a Student in the list
*/

	public class School {

		private List<Student1>  student;
		private List<Teacher> teacher;
		private double totalMoneyEarned;
		private double totalMoneySpend;


		public School() {
		}
		public School(List<Student1>  student,List<Teacher> teacher,double totalMoneyEarned,double totalMoneySpend) {
			this.student=student;
			this.teacher=teacher;
			this.totalMoneyEarned=totalMoneyEarned;
			this.totalMoneySpend=totalMoneySpend;
		}
		public void addTeacher(Teacher teacher) {
	        teacher.add(teacher);
	        System.out.println("Mesuesi " + teacher.getName() + " u shtua !");
	    }
		public void addStudent(Student1 student) {
			student.add(student);
			System.out.println("Studenti"+ student.getName() + );
		}
	}

