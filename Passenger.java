/**
 * The Passenger class represents passengers on a train.
 * 
 * A Passenger consists of a String name. It may board or get off of a given train car.
 */

public class Passenger implements PassengerRequirements {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    // Accessors
    /**
     * Getter for name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    // Implemented functions

    public void boardCar(Car cart) {
        if (cart.addPassenger(this)) {
            cart.getPassengers().add(this);
        }
    }

    public void getOffCar(Car cart) {
        if (cart.removePassenger(this)) {
            cart.getPassengers().remove(this);
        }
    }

    public static void main(String[] args) {

    }


}
