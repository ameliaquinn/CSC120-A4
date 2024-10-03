/** Engine --- creates engine and stores its attributes
 * @author Amelia
 */
public class Engine {
    public FuelType fuelType;
    private double maxFuel;
    private double currentFuel;

    /**
     * Constructor
     * @param fuelType
     * @param maxFuel
     * @param currentFuel
     */
    public Engine(FuelType fuelType, double maxFuel, double currentFuel) {
        this.fuelType = fuelType;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
    }

    /** refuel
     * Returns fuel level to maximum
     */
    private void refuel() {
        this.currentFuel = maxFuel;
    }

    /** go
     * depletes fuel and checks if it is empty
     * @return if the train is currently running (boolean)
     */
    private boolean go() {
        this.currentFuel = currentFuel - 5;
        System.out.println("Current fuel level: " + currentFuel);
        if (currentFuel > 0) {
            return true;
        } else {
            return false;
        }
    }

    
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
        myEngine.refuel();
        System.out.println("Refueled!");
    }
}

    

