public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String manufacturer, String model, int year, int numberOfDoors) {
        super(manufacturer, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Anzahl der Türen: " + numberOfDoors);
    }
}