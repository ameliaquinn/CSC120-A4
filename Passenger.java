import java.util.ArrayList;

/** Passenger --- initializes passengers and stores their names
 * @author Amelia
 */
public class Passenger {

    public String name;

    /**
     * Constructor
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /** getName
     * Accessor for the name
     * @return the passenger's name
     */
    public String getName() {
        return name;
    }
    
    /** boardCar
     * adds passenger to a given car c
     * @param c
     * @return if the board was successful (bool)
     */
    public boolean boardCar (Car c) {
        return c.addPassenger(this);
    } 

    /** getOffCar
     * removes passenger from given car c
     * @param c
     * @return if the board was successful (bool)
     */
    public boolean getOffCar (Car c) {
        return c.removePassenger(this);
    }

    public static void main(String args[]) {
        Car myCar = new Car(5, new ArrayList<Passenger>());
        Passenger Amelia = new Passenger("Amelia");
        Amelia.boardCar(myCar);
        Amelia.getOffCar(myCar);
    }
}
