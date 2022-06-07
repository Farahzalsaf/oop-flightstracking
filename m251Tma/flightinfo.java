/**
 * Student name: Farah Al Safwan
 * Student ID: 20460076
 */

package m251Tma; //package 

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class flightinfo{
    // Arraylist that contains all the flights data 
    //The ArrayList will be a collection of data
    private static ArrayList<flights> flightss = new ArrayList<>();
    
    /**offering a new flight and checking if the flight exists at the said date 
     * the variable flight means the possible flight that might be offered 
     * the variable date means the possible date that the flight might be in 
     */

     static void offeringANewFlight(flights flight, String date){
         for (flights x : flightss) {
             if (flight.equals(x)) {
                 System.out.println("[Failed to book] we apologize, the flight "+ flight.getNum()+" is already offered at "+ flight.getTheDate());
                 return; //the execution of for each loop will stop here   
             }
             
         }

         // setting the date of the flight 
         flight.setTheDate(date);
         //adding the flight to the ArrayList above 
         flightss.add(flight);
         System.out.println("[Flight has been booked successfully!] The flight: "+ flight.getNum() + "has been added successfully to the date : "+ date);

     }

     /**adding a passenger to a specific flight 
      * the variable "passenger" is the passenger that is going to be added to the flight 
      the variable "flight" is the flight that the passenger is going to be added in
      */

      static void addingPassengerToHisFlight (passengers passengerToBeAdded, flights flightOfPassenger ){
          //checking if the flight has a capacity for the passenger to be added or not 
          if (flightOfPassenger.getPassenger().size() < flights.maxiNoOfPassengers) {
              ///checking if the passenger already exists in the flight 
              boolean alreadyInExistence = false;
              for (int i = 0; i < flightOfPassenger.getPassenger().size(); i++) {
                  passengers passengerAtTheMoment = flightOfPassenger.getPassenger().get(i);
                  if (passengerToBeAdded.equals(passengerAtTheMoment)) {
                      alreadyInExistence = true;
                      break;
                      
                  }
              }

              if (!alreadyInExistence) {
                  // if he does not exist in the flight, as in he is a new passenger on the flight 
                flightOfPassenger.getPassenger().add(passengerToBeAdded);
                System.out.println("[Passenger added successfully!] the passenger: " + passengerToBeAdded.getName() + " has been added to the flight: "+ flightOfPassenger.getNum() + " successfully!");
              } 
              
                else{
                 //if the passenger already exists in the flight 
                 System.out.println("[failed to add passenger to flight] we apologize, the passenger: "+ passengerToBeAdded.getName() + " is already on flight: "+ flightOfPassenger.getNum());
                }
            }

            else{ //if the flight has the maximum number of passengers
              System.out.println("[Failed to add passenger!] we apologize, the flight: "+ flightOfPassenger.getNum() + " already has the maximum number of passengers");
                } 
             
            }

            /**removing a passenger from a specific flight 
             * passengerToBeRemoved variable is the passenger that is going to be removed from a flight 
             * flightOfPassengerToBeRemoved variable is the flight that the passenger is going to be removed from 
             */
            static void removingPassengerFromFlight (passengers passengerToBeRemoved, flights flightOfPassengerToBeRemoved){
                int passengerList = -1; //passenger index 
                for (int i = 0; i < flightOfPassengerToBeRemoved.getPassenger().size(); i++) {
                    passengers passengerAtm = flightOfPassengerToBeRemoved.getPassenger().get(i);
                    if (passengerToBeRemoved.equals(passengerAtm)){
                        passengerList = i;
                        break;
                    }
                    
                }
                // in case the passenger does not exist 
                if (passengerList == -1) {
                    System.out.println("[Failed to add passenger] The passenger: "+ passengerToBeRemoved.getName()+ "does not exist in flight: "+flightOfPassengerToBeRemoved.getNum()); 
                }
                else{
                    //removing the passenger from the flight using else
                    flightOfPassengerToBeRemoved.getPassenger().remove(passengerList);
                    System.out.println("[passenger removed successfully!] the passenger: "+ passengerToBeRemoved.getName()+ "has been removed successfully from the flight: "+ flightOfPassengerToBeRemoved.getNum());
                }
            }
         
         
            // getting the average number of passengers per flight on a specified date
          // the variable takeOffDate is for the takeoff date 
          static void getTheAvgOfPassengers(String takeOffDate){
              int passengerscounter = 0;
              int flightCounter = 0;
            // getting the passengers and flight at a given date 
           for (flights x : flightss) {
         //postfixing the number of passengers 
                if (x.getTheDate().equals(takeOffDate)) {
                    passengerscounter += x.getPassenger().size();
                    //postfixing the counter
                    flightCounter++;
                    
                }
            if (flightCounter == 0){
                System.out.println("[Failed] no flights in this date " + takeOffDate);

            }
            else{
                //calculating to get the avg 
                double avgOfPassengers = (double) passengerscounter / flightCounter;
                avgOfPassengers = Math.round(avgOfPassengers); //using math round to round the average of the passengers to the nearest int
                System.out.println("[Average of the passengers has been counted successfully!] the avg number of passengers per flight of this date " + takeOffDate + "is: " + avgOfPassengers);
            }
        }
          } 
        
        //showing all passengers on the flight 
        static void showAllPassengersOnFlight(){
            String voyagerName;
            //using StringBuilder 
            StringBuilder allVoyagersOnBoard = new StringBuilder();
            for (flights y : flightss) {
                allVoyagersOnBoard
                //using .append here to add information
                    .append("Flight: ")
                    .append(y.getNum())
                    .append(" at date: ")
                    .append(y.getTheDate())
                    .append(" has the following passenger: " + y.getPassenger());
                    
                
            //checking if the flight has passengers or not 
            if (y.getPassenger().size()== 0) allVoyagersOnBoard.append(" Empty (does not have passengers)"); 
                for (int i = 0; i < y.getPassenger().size(); i++) {
                    voyagerName = y.getPassenger().get(i).getName();
                    allVoyagersOnBoard.append(voyagerName).append("  ");

                }
                allVoyagersOnBoard.append("\n");
                    
                
                
            }
            System.out.println(allVoyagersOnBoard);


                
        

        }

        // showing all flights 
        static void showAllFlights(){
            StringBuilder allFlightsInfo = new StringBuilder();

            // getting all flights dates using an ArrayList 
            ArrayList<String> datesOfFlights = gettingavailableDates();

            // for loop for all flights and displaying them 
            for (String w : datesOfFlights) {
                allFlightsInfo.append(w).append(" : ");
                //nesting for each loop 
                for (flights m  : flightss) {
                    if (m.getTheDate().equals(w)) {
                        allFlightsInfo.append("Flight: ").append(m.getNum()).append(" ");
                        
                    }
                    
                }
                allFlightsInfo.append("\n");
                
                
            }
            System.out.println(allFlightsInfo);
        }

        // getting all the unique dates
        // creating a private array list that contains all the unique data from all classes
        private static ArrayList<String> gettingavailableDates(){
            String dates;
            ArrayList<String> flightDates = new ArrayList<>();
            for (flights z : flightss) {
                dates = z.getTheDate();

                // checking if it is already there using an if statement 
                if (!flightDates.contains(dates) ) {
                    flightDates.add(dates);
                    
                }

                
            }
            return flightDates;
        }

        // saving all the data above inside of a .txt file
        static void savingAllData(){
            StringBuilder flightsInformation = new StringBuilder();
            for (flights w : flightss) {
                flightsInformation
                    .append(w.toString())
                    .append("\n");// to make a new line 
                
            }

            //try and catch method to catch any errors that might happen
            try {
                FileWriter myData = new FileWriter("Flights_information.txt");
                myData.write(flightsInformation.toString());
                myData.close(); //closing the method so it would not go any further 
                System.out.println("[All data has been added and written to \'Flights_information.txt\' successfully!!]");

            } catch (IOException f) {
                System.out.println("[Failed to add data!] we apologize, an error occurred while saving the data ");
                
            }
            
        }

    }







