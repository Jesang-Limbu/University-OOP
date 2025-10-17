/*
  Java Programming - Joyce Farrell
  Chapter 4 Exercise 2A
*/

public class Lease {
    private String tenantName;
    private String apartmentNumber;
    private double monthlyRent;
    private int leaseTermMonths;
    private static float petFee = 10;
    
    public Lease() {
	this.tenantName = "XXX";
	this.apartmentNumber = "0";
	this.monthlyRent = 1000;
	this.leaseTermMonths = 12;
    }
    
    public static void main(String[] args) {
	Lease newLease = new Lease();
	newLease.setTenantName("John Smith");
	newLease.setApartmentNumber("34");
	newLease.setMonthlyRent(1234.56);
	newLease.setLeaseTermMonths(14);

	newLease.addPetFee();
	System.out.println(newLease);
    }

    public String toString() {
	return "Lease's name: " + tenantName + "\nLease's apt number: " + apartmentNumber + "\nMonthly rent: " + monthlyRent + "\nLease term: " + leaseTermMonths + " months.";
	
    }

    public String getTenantName() {
	return tenantName;
    }

    public String getApartmentNumber() {
	return apartmentNumber;
    }

    public double getMonthlyRents() {
	return monthlyRent;
    }

    public int leaseTermMonths() {
	return leaseTermMonths;
    }

    public void setTenantName(String name) {
	tenantName = name;
    }

    public void setApartmentNumber(String num) {
	apartmentNumber = num;
    }

    public void setMonthlyRent(double rent) {
	monthlyRent = rent;
    }

    public void setLeaseTermMonths(int months) {
	leaseTermMonths = months;
    }

    public void addPetFee() {
	monthlyRent += petFee;
	explainPetPolicy();
    }

    public static void explainPetPolicy() {
	System.out.println("If you have a pet living with you during your lease, then we charge an extra £" + petFee + " per month.\nThank you for understanding.");
    }
}
