/**
 * Students name: Farah Al Safwan
 * Students ID: 20460076
 */
package m251Tma;
//importing java utilities 
import java.util.*;
public class flights{ 
    // class variable of the type int 
    static final int maxiNoOfPassengers = 5;
    // the number of ids
    private static int idS= 100;
    /**
    creating 3 private instance variables, pilot of the type string, flightNumber of the type int and date of the type date and 3 private attributes of my choice   */
    private pilots pilot; //this is the pilot of the flight 
    private String theDestination;
    private String theDuration;
    private String theArrivalDate;
    private int theFlightNumber;
    private String theDate;
    private int num;
    private ArrayList <passengers> passenger; //declaring the array list passenger of the type passengers to hold all passengers in the flight 
    
    
    public flights() { // zero-argument constructor 
    }

    public flights(pilots pilotOfTheFlight, String theDestinationOfTheFlight, String theDurationOfTheFlight, String arrivalDateOfFlight, int flightNumber, String string) {
        this.num = idS;
        idS++; 
        this.pilot = pilotOfTheFlight;
        this.theDestination = theDestinationOfTheFlight;
        this.theDuration = theDurationOfTheFlight;
        this.theArrivalDate = arrivalDateOfFlight;
        this.theFlightNumber = flightNumber;
        this.theDate = string;
        passenger = new ArrayList<>(); // initializing the array list 
    }
    //getter and setter methods for the attributes 

    public int getNum() {
        return num;
    }
    public void setNum(int numS) {
        this.num = numS;
    }

    public pilots getPilot() {
        return this.pilot;
    }

    public void setPilot(pilots pilot) {
        this.pilot = pilot;
    }

    public String getTheDestination() {
        return this.theDestination;
    }

    public void setTheDestination(String theDestination) {
        this.theDestination = theDestination;
    }

    public String getTheDuration() {
        return this.theDuration;
    }

    public void setTheDuration(String theDuration) {
        this.theDuration = theDuration;
    }

    public String getTheArrivalDate() {
        return this.theArrivalDate;
    }

    public void setTheArrivalDate(String theArrivalDate) {
        this.theArrivalDate = theArrivalDate;
    }

    public int getTheFlightNumber() {
        return this.theFlightNumber;
    }

    public void setTheFlightNumber(int theFlightNumber) {
        this.theFlightNumber = theFlightNumber;
    }

    public String getTheDate() {
        return this.theDate;
    }

    public void setTheDate(String theDate) {
        this.theDate = theDate;
    }

    
    public ArrayList<passengers> getPassenger() {
        return passenger;
    }

    //overriding the method equals from the class object 
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof flights)) {
            return false;
        }
        flights flights = (flights) o;
        return getNum() == flights.getNum();
    }

    @Override
    public String toString() {
        return "The flight: "+ num + "\n" + "The destination: "+ theDestination + "\n" + 
        "The date of the flight: "+ theDate + "\n"+ "The duration of the flight: "+ theDuration +
         "The pilot of the flight: "+ pilot + "\n" + "The passengers: "+
         "{" + passenger.size() + "} : "+ passenger +"\n";
    }
     

}