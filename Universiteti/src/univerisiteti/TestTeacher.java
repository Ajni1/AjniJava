package univerisiteti;

public class TestTeacher {

	public static void main(String[] args)  {
		try {
			Teacher t100 =  new Teacher(100,"Ardi",90000);
			Teacher t101 =  new Teacher(101,"Dejvi",95000);
			Teacher t102 =  new Teacher(102,"Rea",90000);
			System.out.println(t100);
			System.out.println("");
			System.out.println(t101);
			System.out.println("");
			System.out.println(t102);
		    
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Programi vazhdon .... ");
		}
	}

}
