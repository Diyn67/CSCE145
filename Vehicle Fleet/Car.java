/*
 * Name: Catherine Phillips / Zachary Phillips
 * Preffered name is Catherine
 * Legal is Zachary
*/
public class Car extends Vehicle {
    private double gasMileage;
    private int numPassengers;

    // Default constructor
    public Car() {
        super(); // Call Vehicle's default constructor
        this.gasMileage = 0.0;
        this.numPassengers = 0;
    }

    // Parameterized constructor
    public Car(String manufacturer, int numCylinders, String owner, double gasMileage, int numPassengers) {
        super(manufacturer, numCylinders, owner); // Call Vehicle's parameterized constructor
        if (gasMileage < 0) {
            throw new IllegalArgumentException("Gas mileage must be non-negative");
        }
        if (numPassengers < 0) {
            throw new IllegalArgumentException("Number of passengers must be non-negative");
        }
        this.gasMileage = gasMileage;
        this.numPassengers = numPassengers;
    }

    // Accessors and Mutators
    public double getGasMileage() {
        return gasMileage;
    }

    public void setGasMileage(double gasMileage) {
        if (gasMileage < 0) {
            throw new IllegalArgumentException("Gas mileage must be non-negative");
        }
        this.gasMileage = gasMileage;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        if (numPassengers < 0) {
            throw new IllegalArgumentException("Number of passengers must be non-negative");
        }
        this.numPassengers = numPassengers;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() +
               ", Gas Mileage: " + gasMileage +
               ", Number of Passengers: " + numPassengers;
    }
}
