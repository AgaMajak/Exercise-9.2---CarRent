public class CarRentTest {
    public static void main(String[] args) {
        RentableCar[] rentableCars = {
                new RentableCar("Ford", 2012, 5),
                new RentableCar("Fiat", 2015, 4)
        };

        for (RentableCar rentableCar : rentableCars) {
            System.out.println(rentableCar.toString());
        }

        rentableCars[0].rent("Józef", "Kowalski", "ADJ567432");
        rentableCars[1].rent("Alicja", "Wolak", "KLJ567098");

        for (RentableCar rentableCar : rentableCars) {
            System.out.println(rentableCar.toString());
        }

        rentableCars[0].handOver();

        for (RentableCar rentableCar : rentableCars) {
            System.out.println(rentableCar.toString());
        }

    }
}
