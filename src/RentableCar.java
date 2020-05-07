public class RentableCar extends Car implements Rentable {
    private Person person;

    public RentableCar(String brand, int yearbook, int numberOfSeats) {

        super(brand, yearbook, numberOfSeats);
    }

    @Override
    public Person rent(String firstName, String lastName, String id) {
        return person = new Person(firstName, lastName, id);
    }

    @Override
    public void handOver() {
        person = null;
    }

    @Override
    public boolean isRent() {
        return person != null;
    }

    @Override
    public String toString() {
        if (isRent()) {
            return String.format("Marka samochodu: %s, rok produkcji: %d, ilość siedzeń: %d.\nDane osoby wypożyczającej samochód: %s %s, numer dowodu: %s\n", getBrand(), getYearbook(), getNumberOfSeats(), person.getFirstName(), person.getLastName(), person.getId());
        } else {
            return String.format("Marka samochodu: %s, rok produkcji: %d, ilość siedzeń: %d.\nNikt aktualnie nie wypożycza samochodu.\n", getBrand(), getYearbook(), getNumberOfSeats());
        }
    }
}
