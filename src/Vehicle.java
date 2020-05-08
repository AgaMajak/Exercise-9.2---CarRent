public abstract class Vehicle implements Moveable {
    private String brand;
    private int yearbook;
    private String direction;

    public Vehicle(String brand, int yearbook) {
        this.brand = brand;
        this.yearbook = yearbook;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearbook() {
        return yearbook;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public void turnLeft() {
        direction = "W lewo";
    }

    @Override
    public void turnRight() {
        direction = "W prawo";
    }

    @Override
    public void goForward() {
        direction = "Prosto";
    }

    @Override
    public void goBack() {
        direction = "Cofanie";
    }
}
