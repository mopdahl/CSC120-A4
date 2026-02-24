import java.util.ArrayList;

/**
 * The Car class represents a single train car.
 * 
 * A Car contains an array of Passengers and a maximum capacity.
 */
public class Car implements CarRequirements {
    // Attributes
    private ArrayList<Passenger> passengers;
    private int capacity;

    /**
     * Car constuctor.
     * @param maxCapacity The highest number of passenger the car can contain.
     */
    public Car(int maxCapacity) {
        // All cars initialize with no passengers on board.
        this.passengers = new ArrayList<>();
        this.capacity = maxCapacity;
    }

    /**
     * Getter for passengers.
     * @return passengers
     */
    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    /**
     * Getter for capacity.
     * @return capacity.
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Returns the number of seats remaining.
     * @return The number of seats remaining.
     */
    public int seatsRemaining() {
        return this.capacity - this.passengers.size();
    }

    /**
     * Adds a passenger to the car, if there is room and the person is not already a passenger.
     * @param person The passenger to be added.
     * @return Boolean. Whether the operation was successful.
     */
    public Boolean addPassenger(Passenger person) {
        if (this.seatsRemaining() > 0 && !this.passengers.contains(person)) {
            return true;
        }
        return false;
    }
    
    /**
     * Removes a passenger from the car.
     * @param person The passenger to be removed.
     * @return Boolean. Whether the operation was successful.
     */
    public Boolean removePassenger(Passenger person) {
        if (this.passengers.contains(person)) {
            return true;
        }
        return false;
    }


    /**
     * Prints the names of the passengers in the car.
     */
    public void printManifest() {
        if (this.passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            for (Passenger person : this.passengers) {
                System.out.println("\t* " + person.getName());
            }
        }
    }

    public static void main(String[] args) {
        Car car = new Car(5);
        Passenger a = new Passenger("a");
        Passenger b = new Passenger("b");
        car.addPassenger(a);
        car.addPassenger(a);
        car.addPassenger(b);
        car.printManifest();
        System.out.println(car.removePassenger(b));
        System.out.println(car.removePassenger(b));
        car.printManifest();
    }

}