
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
	 * @return the feesPaid
	 */
	public double getFeesPaid() {
		return feesPaid;
	}
	/**
	 * @param feesPaid the feesPaid to set
	 */
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}


}
