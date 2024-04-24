public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("MAN", "LKW", 2016);
        Car car = new Car(" DeLorean Motor Company", "DeLorean DMC-12", 1981, 2);

        System.out.println("Informationen zum Fahrzeug:");
        vehicle.displayInfo();

        System.out.println("\nInformationen zum Auto:");
        car.displayInfo();
    }
}