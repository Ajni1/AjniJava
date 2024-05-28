
public class TestProfilShendetesor {

	public static void main(String[] args) {
		ProfilShendetesor ajni = new 
				ProfilShendetesor("Ajni", "Meta", new Data(16,8,2009), 'M', 1.81, 73.0);
		ajni.afishoProfil();
		ProfilShendetesor anisa = new
				ProfilShendetesor("Anisa", "Sula", new Data(10,4,2004) , 'F', 1.71, 62);
		anisa.afishoProfil();

		ProfilShendetesor flavio = new
				ProfilShendetesor("Flavio","Kavaja", new Data(29,7,2007),'M',1.75,70);
		flavio.afishoProfil();
	}

}
