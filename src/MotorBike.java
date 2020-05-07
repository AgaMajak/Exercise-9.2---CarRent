public class MotorBike extends Vehicle {
    private int speedLimit;

    public MotorBike(String brand, int yearbook, int speedLimit) {
        super(brand, yearbook);
        this.speedLimit = speedLimit;
    }
}
