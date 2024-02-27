package univerisiteti;

public class TestStudent {

	public static void main(String[] args) {
		try {
			Student1 s1 = new Student1(123,"Ajni Meta");
			s1.payFee(100);
			System.out.println(s1);
			s1.payFee(200);
			System.out.println(s1);
             
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
		
	}

}
