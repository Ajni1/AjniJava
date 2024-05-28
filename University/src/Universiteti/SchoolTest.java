package Universiteti;

import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
	static final List<Integer> STUDENTIDLIST  = new ArrayList<>();
	static final List<Integer> TEACHERIDLIST = new ArrayList<>();

	public static void main(String[] args) {
		 
        Teacher t1 = new Teacher(1,"Ardi",100000);
        System.out.println(t1);
        Student s1= new Student(5," Ajni Meta");
        s1.payFee(100);
        System.out.println(s1);
        t1.TEACHERIDLIST.addAll(TEACHERIDLIST);
        s1.STUDENTIDLIST.addAll(STUDENTIDLIST);
    
       
	}

}
