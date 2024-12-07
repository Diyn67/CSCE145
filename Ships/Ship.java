
// Author: Catherine Phillips


import java.util.regex.*;

public class Ship {
    private String name;
    private String launchDate; // Format: mm/dd/yyyy

    // Constructor
    public Ship(String name, String launchDate) {
        this.name = name;
        setLaunchDate(launchDate);
    }

    // Accessor and Mutator for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Accessor and Mutator for launchDate
    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        if (isValidLaunchDate(launchDate)) {
            this.launchDate = launchDate;
        } else {
            this.launchDate = "01/01/1990"; // Default if invalid
            System.out.println("Error: Launch date must be between 1990 and 2019. Setting default date.");
        }
    }

    private boolean isValidLaunchDate(String date) {
        Pattern pattern = Pattern.compile("^(0[1-9]|1[0-2])/([0-2][0-9]|3[01])/((199[0-9])|(200[0-9])|(201[0-9]))$");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Launch Date: " + launchDate;
    }
}
