public class Apartment {
    private final String apartmentNumber;
    private final int numberOfBedrooms;
    private final int numberOfBaths;
    private final float rentAmount;

    public Apartment(String apartmentNumber, int numberOfBedrooms, int numberOfBaths, float rentAmount) {
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

    public float getRentAmount() {
        return rentAmount;
    }
}
