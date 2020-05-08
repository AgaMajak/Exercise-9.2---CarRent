public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String brand, int yearbook, int numberOfSeats) {
        super(brand, yearbook);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
