package univerisiteti;

import java.util.ArrayList;
import java.util.List;

public class TestSchool {
	static final List<Integer> STUDENTIDLIST  = new ArrayList<>();
	static final List<Integer> TEACHERIDLIST = new ArrayList<>();
	public static void main(String[] args) throws Exception {

        Teacher t1;
		
			t1 = new Teacher(1,"Ardi",90000);
        System.out.println(t1);
        Student s10= new Student(10," Ajni Meta");
        s10.payFee(100);
        System.out.println(s10);
        t1.TEACHERIDLIST.addAll(TEACHERIDLIST);
        s10.STUDENTIDLIST.addAll(STUDENTIDLIST);
        System.out.println("Add a teacher:" + TEACHERIDLIST);
        System.out.println("Add a student:" + STUDENTIDLIST);

	}



	}


