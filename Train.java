import java.util.ArrayList;

/**
 * The Train class represents a train object.
 * 
 * Trains contain an Engine and an array of Cars, each of which contains Passengers.
 */
public class Train implements TrainRequirements {
    private Engine engine;
    private ArrayList<Car> trainCars;

    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelCapacity, currentFuelLevel);

        // Initializes train with nCars cars, each of which can contain passengerCapacity passengers.
        this.trainCars = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            this.trainCars.add(new Car(passengerCapacity));
        }
    }

    /**
     * Getter for engine.
     * @return Engine.
     */
    public Engine getEngine() {
        return this.engine;
    }

    /**
     * Returns the Car at a given index in the train's array of Cars.
     * @param idx The location of the Car in the train's ArrayList.
     * @return The Car at location idx in the train's ArrayList.
     */
    public Car getCar(int idx) {
        return this.trainCars.get(idx);
    }

    /**
     * Gets the maximum capacity of the train.
     * @return capacity The total capacity of the train.
     */
    public int getMaxCapacity() {
        int capacity = 0;
        for (Car car : this.trainCars) {
            capacity += car.getCapacity();
        }
        return capacity;
    }

    /**
     * Returns the number of empty seats in the train.
     * @return seats The total empty seats in the train.
     */
    public int seatsRemaining() {
        int seats = 0;
        for (Car car : this.trainCars) {
            seats += car.seatsRemaining();
        }
        return seats;
    }

    /**
     * Prints the names of each passenger in each of the cars.
     */
    public void printManifest() {
        System.out.println("TRAIN MANIFEST: ");
        for (Car car : this.trainCars) {
            if (car.seatsRemaining() != car.getCapacity()) {
                car.printManifest();
            }
        }
    }

    public static void main(String[] args) {
        Train t = new Train(FuelType.ELECTRIC, 2.0, 2.0, 4, 2);
        for (Car car : t.trainCars) {
            for (int i = 0; i < car.getCapacity(); i++) {
                new Passenger("Passenger "+i+" in car " + car).boardCar(car);
            }
        }
        t.printManifest();
        
    }   
}
