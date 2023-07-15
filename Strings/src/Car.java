/**
 * This class represents a basic Car.
 * The Car has a make, model, color, model year and a boolean indicating if it's
 * electric or not.
 *
 * @author WCCI TaylourH
 */

public class Car {

    private String make;
    private String model;
    private String color;
    private int modelYear;
    private boolean isElectric;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns the model year of the car.
     *
     * @return The model year of the car.
     */
    public int getModelYear() {
        return this.modelYear;
    }

    /**
     * Sets the model year of the car.
     *
     * @param modelYear The model year of the car.
     */
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    /**
     * Constructs a new Car.
     *
     * @param make       The make of the car.
     * @param model      The model of the car.
     * @param color      The color of the car.
     * @param modelYear  The model year of the car.
     * @param isElectric Whether the car is electric or not.
     */
    public Car(String make, String model, String color, int modelYear, boolean isElectric) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.modelYear = modelYear;
        this.isElectric = isElectric;
    }

    /**
     * Prints out the details of the car in a sentence.
     */
    /**
     * Prints the details of the Car.
     */
    public void printCarDetails() {
        String powerType;
        if (isElectric) {
            powerType = "electric";
        } else {
            powerType = "gas";
        }
        System.out.println(
                "This " + color + " " + make + " " + model + " is a " + powerType + " powered vehicle from " + modelYear
                        + ".");
    }

}
