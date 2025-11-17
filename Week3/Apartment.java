public class Apartment {
    private final String apartmentNumber;
    private final int numberOfBedrooms;
    private final int numberOfBaths;
    private final double rentAmount;

    public Apartment(String apartmentNumber, int numberOfBedrooms, int numberOfBaths, double rentAmount) {
        this.apartmentNumber = apartmentNumber;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBaths = numberOfBaths;
        this.rentAmount = rentAmount;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public int getNumberOfBaths() {
        return numberOfBaths;
    }

    public double getRentAmount() {
        return rentAmount;
    }
}
