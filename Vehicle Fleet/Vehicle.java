/*
 * Name: Catherine Phillips / Zachary Phillips
 * Preffered name is Catherine
 * Legal is Zachary
*/
public class Vehicle {
    private String manufacturer;
    private int numCylinders;
    private String owner;

    // Default constructor
    public Vehicle() {
        this.manufacturer = "Unknown";
        this.numCylinders = 1;
        this.owner = "Unknown";
    }

    // Parameterized constructor
    public Vehicle(String manufacturer, int numCylinders, String owner) {
        if (numCylinders <= 0) {
            throw new IllegalArgumentException("Number of cylinders must be greater than 0");
        }
        this.manufacturer = manufacturer;
        this.numCylinders = numCylinders;
        this.owner = owner;
    }

    // Accessors and Mutators
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public void setNumCylinders(int numCylinders) {
        if (numCylinders <= 0) {
            throw new IllegalArgumentException("Number of cylinders must be greater than 0");
        }
        this.numCylinders = numCylinders;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return numCylinders == vehicle.numCylinders &&
               manufacturer.equals(vehicle.manufacturer) &&
               owner.equals(vehicle.owner);
    }

    // toString method
    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer +
               ", Number of Cylinders: " + numCylinders +
               ", Owner: " + owner;
    }
}
