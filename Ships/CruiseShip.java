
// Author: Catherine Phillips


public class CruiseShip extends Ship {
    private int passengerCapacity;
    private int crewCount;

    // Constructor
    public CruiseShip(String name, String launchDate, int passengerCapacity, int crewCount) {
        super(name, launchDate);
        this.passengerCapacity = passengerCapacity;
        this.crewCount = crewCount;
    }

    // Accessors and Mutators for passengerCapacity and crewCount
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCrewCount() {
        return crewCount;
    }

    public void setCrewCount(int crewCount) {
        this.crewCount = crewCount;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Passenger Capacity: " + passengerCapacity + ", Crew: " + crewCount;
    }
}
