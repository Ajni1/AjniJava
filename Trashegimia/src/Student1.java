
class Student1 {
   
    private int id;
    private String name;
    private double feesPaid;
    //konstruktori pa parametra
    public Student1() {
    	
    }
    // konstruktori me parametra
    public Student1(int id, String name, double feesPaid) {
        this.id = id;
        this.name = name;
        this.feesPaid = feesPaid;
    }

    //metoda e nxjerrjes se tarifave 
    public void payFee(double amount) {
        feesPaid += amount;
        System.out.println("Tarifat e paguajtura nga " + name + ":" + amount);
    }


}
