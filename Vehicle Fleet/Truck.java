/*
 * Name: Catherine Phillips / Zachary Phillips
 * Preffered name is Catherine
 * Legal is Zachary
*/
public class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;

    // Default constructor
    public Truck() {
        super(); // Call Vehicle's default constructor
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    // Parameterized constructor
    public Truck(String manufacturer, int numCylinders, String owner, double loadCapacity, double towingCapacity) {
        super(manufacturer, numCylinders, owner); // Call Vehicle's parameterized constructor
        if (loadCapacity < 0) {
            throw new IllegalArgumentException("Load capacity must be non-negative");
        }
        if (towingCapacity < 0) {
            throw new IllegalArgumentException("Towing capacity must be non-negative");
        }
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    // Accessors and Mutators
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity < 0) {
            throw new IllegalArgumentException("Load capacity must be non-negative");
        }
        this.loadCapacity = loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity < 0) {
            throw new IllegalArgumentException("Towing capacity must be non-negative");
        }
        this.towingCapacity = towingCapacity;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() +
               ", Load Capacity: " + loadCapacity +
               ", Towing Capacity: " + towingCapacity;
    }
}
