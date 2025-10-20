public class Apartment {
    int aptNum;
    int bedrooms;
    int baths;
    double rent;
    
    public Apartment(int aptNum, int bedrooms, int baths, double rent) {
	this.aptNum = aptNum;
	this.bedrooms = bedrooms;
	this.baths = baths;
	this.rent = rent;
    }

    public toString() {
	return "Apartment number: " + aptNum + "\nBedrooms: " + bedrooms + "\nBaths: " + baths + "\nRent: " + rent;
    }

    public static void main(String[] args) {
	
    }

    public int getAptNumber() {
	return aptNum;
    }

    public int getBedrooms() {
	return bedrooms;
    }

    public int getBaths() {
	return baths;
    }

    public double getRent() {
	return rent;
    }
}
