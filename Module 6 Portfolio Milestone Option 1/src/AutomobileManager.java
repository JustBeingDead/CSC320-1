public class AutomobileManager {
    private String make;
    private String model;
    private String color;
    private int year;

    // Constructor to initialize automobile information
    public AutomobileManager(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to check if vehicle information matches and remove
    public String checkAndRemoveVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        if (autoMake.equals(make) && autoModel.equals(model) && autoColor.equals(color) && autoYear == year) {
            // Values entered match, remove vehicle information
            make = null;
            model = null;
            color = null;
            year = 0;
            return "Vehicle information removed.";
        } else {
            // Return message indicating mismatch
            return "Vehicle information does not match.";
        }
    }

    // Method to retrieve vehicle information
    public String getVehicleInfo() {
        if (make != null) {
            return "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year;
        } else {
            return "No vehicle information available.";
        }
    }

    // Method to update vehicle details
    public void updateVehicleDetails(String newMake, String newModel, String newColor, int newYear) {
        make = newMake;
        model = newModel;
        color = newColor;
        year = newYear;
    }
}
