/**
 * The Engine class represents a train engine.
 * 
 * An Engine contains a type of type, a maximum fuel level, and a current fuel level.
 */

public class Engine implements EngineRequirements {
    // Attributes
    private FuelType fuel;
    private double maxFuel; 
    private double currentFuel;

    /**
     * Engine constructor.
     * @param fuel The type of fuel the engine uses.
     * @param maxFuel The maximum amount of fuel the engine can contain.
     * @param currentFuel The amount of fuel currently in the engine.
     */
    public Engine(FuelType fuel, double max_fuel, double current_fuel) {
        this.fuel = fuel;
        this.maxFuel = max_fuel;
        this.currentFuel = current_fuel;
    }

    // Accessors
    /**
     * Getter for fuelType.
     * @return fuelType.
     */
    public FuelType getFuelType() {
        return this.fuel;
    }

    /**
     * Getter for maxFuel.
     * @return maxFuel.
     */
    public double getMaxFuel() {
        return this.maxFuel;
    }

    /**
     * Getter for currentFuel.
     * @return currentFuel.
     */
    public double getCurrentFuel() {
        return this.currentFuel;
    }

    // Non-Accessor Methods
    /**
     * Changes the current fuel level to the maximum fuel level.
     */
    public void refuel() {
        this.currentFuel = this.getMaxFuel();
    }

    /**
     * Checks if the engine has fuel, and decreases fuel if so.
     * @return boolean If the engine has enough fuel.
     */
    public Boolean go() {
        // Prevents changing fuel level if fuel is insufficient.
        if (this.getCurrentFuel() <= 0) {
            return false;
        // If fuel is sufficient, decreases fuel level.
        } else {
            // Note: allows for negative nums.
            // Could fix by comparing currentValue to step value instead of 0, but would not fit project reqs in README.
            this.currentFuel -= 1; 
            System.out.println("Fuel level: " + this.currentFuel);
            return true;
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 10.0, 4.5);
        System.out.println("The wheels in the engine go: ");
        while (myEngine.go()) {
            System.out.println("Round and round,");
        }
        System.out.println("The wheels in the engine go round and round,\nUntil the fuel runs out.");
    }

}