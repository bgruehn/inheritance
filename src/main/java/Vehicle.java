public class Vehicle {
    private String manufacturer;
    private String model;
    private int year;

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Hersteller: " + manufacturer);
        System.out.println("Modell: " + model);
        System.out.println("Baujahr: " + year);
    }
}