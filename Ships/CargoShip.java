
// Author: Catherine Phillips


public class CargoShip extends Ship {
    private double tonnage; // Dead Weight Tonnage
    private double maxSpeed; // In mph

    // Constructor
    public CargoShip(String name, String launchDate, double tonnage, double maxSpeed) {
        super(name, launchDate);
        this.tonnage = tonnage;
        this.maxSpeed = maxSpeed;
    }

    // Accessors and Mutators for tonnage and maxSpeed
    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Tonnage: " + tonnage + " DWT, Maximum Speed: " + maxSpeed + " mph";
    }
}
