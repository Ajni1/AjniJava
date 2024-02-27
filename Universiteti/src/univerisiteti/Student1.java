package univerisiteti;

import java.util.ArrayList;
import java.util.List;

class Student1 {
   
    private Integer id;
    private String name;
    private double feesPaid;
    static final List<Integer> STUDENTIDLIST= new ArrayList<>();
    //konstruktori pa parametra
    //public Student() {
    //}
    // konstruktori me parametra
    public Student1(Integer id, String name) {
      setId(id);
      setName(name);
    }

    //metoda e nxjerrjes se tarifave 
  
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		if(id<=0) throw new IllegalArgumentException("error,Id is negative");
		if(STUDENTIDLIST.contains(id)) throw new IllegalArgumentException("Error,Id"+id+"exists");
		else {
			STUDENTIDLIST.add(id);
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
	public void add(Student1 student) {
		// TODO Auto-generated method stub
		
	}
  public void payFee(double amount) {
        feesPaid += amount;
        System.out.println("The fees were paid by " + name + ":$" + amount);
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("	Id:%d\nName:%s\nFees Paid:%.2f",id,name);
				
				
	}


}
