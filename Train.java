import java.util.ArrayList;

/** Train --- initializes & stores all information about the train 
 * @author Amelia
 */
public class Train {

    Engine engine;
    ArrayList<Car> carList;
    FuelType fuelType;
    double fuelCapacity;
    int nCars;
    int passengerCapacity;

    /**
     * Constructor
     * @param fuelType
     * @param fuelCapacity
     * @param nCars
     * @param passengerCapacity
     */
    private Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.carList = new ArrayList<Car>();
        for (int i=0; i<nCars; i++) {
            carList.add(new Car(passengerCapacity, new ArrayList<Passenger>()));
        }
        this.nCars = nCars;
        this.engine = new Engine(fuelType,fuelCapacity,fuelCapacity);
    }

    /** getEngine
     * Accessor for the engine
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /** getCar
     * accesses car at given location i
     * @param i
     * @return the car
     */
    public Car getCar (int i) {
        return carList.get(i);
    }

    /** getMaxCapacity
     * finds capacity of all combined cars
     * @return max capacity
     */
    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (int i=0; i<nCars; i++) {
            maxCapacity += getCar(i).getCapacity();
        }
        return maxCapacity;
    }

    /** seatsRemaining
     * finds the total number of open seats on all cars
     * @return the number
     */
    public int seatsRemaining() {
        int seatsRemaining = 0;
        for (int i=0; i<nCars; i++) {
            seatsRemaining += getCar(i).seatsRemaining();
        }
        return seatsRemaining;
    }

    /** printManifest
     * prints a list of all passengers onboard
     */
    public void printManifest() {
        for (int i =0; i<nCars; i++) {
            getCar(i).printManifest();
        }
    }

    public static void main(String args[]) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0,5,25);
        myTrain.getEngine();
        myTrain.getCar(0);
        myTrain.getMaxCapacity();
        myTrain.seatsRemaining();
        myTrain.printManifest();
    }
}
