import java.util.ArrayList;

/**
 * Car --- initializes and stores attributes of a train car
 * @author Amelia 
 */
public class Car {
    private int maxCapacity;
    private ArrayList<Passenger> passengerList;

    /**
     * Initializes a new car 
     * @param maxCapacity
     * @param passengerList
     */
    public Car(int maxCapacity, ArrayList<Passenger> passengerList) {
        this.maxCapacity = maxCapacity;
        this.passengerList = passengerList;
    }

    /** getCapacity
     * Accessor for the maximum capacity
     * @return the capacity
     */
    public int getCapacity() {
        return maxCapacity;
    }

    /** seatsRemaining
     * Finds the number of seats remaining
     * @return the number of seats remaining
     */
    public int seatsRemaining() {
        return maxCapacity - passengerList.size();
    }

    /** addPassenger
     * checks that there are seats remaining, then adds a new passenger
     * @param p
     * @return whether the add was successful (boolean)
     */
    public boolean addPassenger(Passenger p) {
        if (seatsRemaining() != 0) {
            passengerList.add(p);
            return true;
        } else {
            return false;
        }
    }

    /** removePassenger
     * checks that p is onboard, then removes p from the car
     * @param p
     * @return if the remove was successful (bool)
     */
    public boolean removePassenger(Passenger p) {
        if (passengerList.contains(p)) {
            passengerList.remove(p);
            return true;
        } else {
            return false;
        }
    }
    
    /** printManifest
     * prints a list of all passengers in the car
     */
    public void printManifest() {
        if(passengerList.size() == 0) {
            System.out.println("This car is EMPTY");
        } else {
            for (int i=0;i<passengerList.size();i++) {
                Passenger item = passengerList.get(i);
                System.out.println(item.getName());
            }
            }
            }
    
        public static void main(String args[]) {
        ArrayList<Passenger> myList = new ArrayList<Passenger>();
        Car myCar = new Car(5, myList);
        myCar.getCapacity();
        myCar.seatsRemaining();
        Passenger Amelia = new Passenger("Amelia");
        myCar.addPassenger(Amelia);
        myCar.printManifest();
        myCar.removePassenger(Amelia);
        myCar.printManifest();
    }
 }
