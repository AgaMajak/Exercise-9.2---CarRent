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
    public String turnLeft() {
        return direction = "W lewo";
    }

    @Override
    public String turnRight() {
        return direction = "W prawo";
    }

    @Override
    public String goForward() {
        return direction = "Prosto";
    }

    @Override
    public String goBack() {
        return "Cofanie";
    }
}
