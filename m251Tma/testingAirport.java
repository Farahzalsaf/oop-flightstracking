package m251Tma;
public class testingAirport {
    public static void main(String[] args) {
        // creating and initializing objects oF the type pilots 
        pilots pilotNo1 = new pilots(" Farah", "505-328-9992", 65000, "Saudi Arabian", "25");
        pilots pilotNo2 = new pilots(" Iliyas", "505-328-6689", 75000, "Japanese", "25");
        pilots pilotNo3 = new pilots(" Arafat", "505-328-4565", 15000, "Kuwaiti", "45");
        pilots pilotNo4 = new pilots(" Farris", "505-789-9992", 15000, "Saudi Arabian", "28");


        //creating and initializing objects oF the type Flights 
        flights FlightNo1 = new flights(pilotNo1, "Bali", "6 hours", "09/09/2021", 1001, "8/9/2021");
        flights FlightNo2 = new flights(pilotNo3, "Maldives", "5.5 hours", "14/02/2021", 6101, "14/2/2021");
        flights FlightNo3 = new flights(pilotNo2, "Tokyo", "8 hours", "13/01/2021", 1819, "12/1/2021");
        flights FlightNo4 = new flights(pilotNo4, "Seoul", "9 hours", "09/09/2021", 1002, "9/9/2021");
 


        // creating and initializing passengers 
        passengers PassengerNo1 = new passengers("Layan ", "Khobar,Saudi Arabia", "052971023", "jordanian","19");
        passengers PassengerNo2 = new passengers("Layla ", "Riyadh, Saudi Arabia", "058938333", "Saudi Arabian", "20");
        passengers PassengerNo3 = new passengers("Ab ", "Jeddah, Saudi Arabia", "0568992233", "Saudi Arabian", "19");
        passengers passengerNo4 = new passengers("Yosef ", "Khobar, Saudi Arabia", "056788211", "Egyptian", "20");
        passengers passengerNo5 = new passengers("Danyah ", "Dammam, Saudi Arabia", "058929911", "Saudi Arabian", "20");
        passengers passengerNo6 = new passengers("Deema ", "Dammam, Saudi Arabia", "059931190", "Saudi Arabian", "30");
        passengers passengerNo7 = new passengers("Zahra ", "London, Britain", "+44 884799222", "British", "25");
        passengers passengerNo8 = new passengers("Hassan ", "Tokyo, Japan", "788849921","Saudi Arabian", "26");
        passengers passengerNo9 = new passengers("Allie ", "Oklahoma, United States Of America", "+1 900-901-9999","American", "24");
        passengers passengerNo10 = new passengers("Taki ", "Bali, Indonesia ", "0566728811", "Indonesian", "19");
        passengers passengerNo11 = new passengers("Raghad ", "Dammam, Saudi Arabia", "0588299111", "Saudi Arabian", "18");
        passengers passengerNo12 = new passengers("Saud ", "Khobar, Saudi Arabia", "057772811", "Bahraini", "25");
        passengers passengerNo13 = new passengers("Faris ", "Madrid, Spain", "889221991", "Spanish", "22");
        passengers passengerNo14 = new passengers("Kareem ", "Algeria", "222-90293-211", "Algerian", "29");
        passengers passengerNo15 = new passengers("Tarfa ", "Zurich, switzerland", "889667443", "Swiss", "16");
        passengers passengerNo16 = new passengers("Kierra ", "Paris, France", "998661342", "French", "26");
        passengers passengerNo17 = new passengers("gigi ", "Rome, Italy", "998755621", "Italian", "45");
        passengers passengerNo18 = new passengers("Amara ", "Abu Dhabi, United Arab Emarits", "886144211", "Emarati", "35");
        passengers passengerNo19 = new passengers("Loren ", "Rabat, Morroco", "997338111", "Morrocan", "27");
        passengers passengerNo20 = new passengers("Dani ", "Seoul, South Korea", "990188311", "Korean", "");
        
        //displaying the offered flights
        System.out.println("Flights Offered: ");
        flightinfo.offeringANewFlight(FlightNo1, "8/9/2021");
        flightinfo.offeringANewFlight(FlightNo2, "14/2/2021");
        flightinfo.offeringANewFlight(FlightNo3, "12/1/2021");
        flightinfo.offeringANewFlight(FlightNo4, "9/9/2021");


        System.out.println("*****************************************************"); //separator for aesthetics only
        

        System.out.println("Display All Flights");
        flightinfo.showAllFlights();


        System.out.println("*****************************************************"); //separator for aesthetics only

        System.out.println("showing all flight's passengers");
        flightinfo.showAllPassengersOnFlight();


        System.out.println("*****************************************************"); //separator for aesthetics only
        System.out.println("\n");

        System.out.println("adding passengers to flights");
        flightinfo.addingPassengerToHisFlight(PassengerNo1, FlightNo1);
        flightinfo.addingPassengerToHisFlight(PassengerNo2, FlightNo1);
        flightinfo.addingPassengerToHisFlight(PassengerNo3, FlightNo1);
        flightinfo.addingPassengerToHisFlight(passengerNo4, FlightNo1);
        flightinfo.addingPassengerToHisFlight(passengerNo5, FlightNo1);
        flightinfo.addingPassengerToHisFlight(passengerNo6, FlightNo2);
        flightinfo.addingPassengerToHisFlight(passengerNo7, FlightNo2);
        flightinfo.addingPassengerToHisFlight(passengerNo8, FlightNo2);
        flightinfo.addingPassengerToHisFlight(passengerNo9, FlightNo2);
        flightinfo.addingPassengerToHisFlight(passengerNo10, FlightNo2);
        flightinfo.addingPassengerToHisFlight(passengerNo11, FlightNo3);
        flightinfo.addingPassengerToHisFlight(passengerNo12, FlightNo3);
        flightinfo.addingPassengerToHisFlight(passengerNo13, FlightNo3);
        flightinfo.addingPassengerToHisFlight(passengerNo14, FlightNo3);
        flightinfo.addingPassengerToHisFlight(passengerNo15, FlightNo3);
        flightinfo.addingPassengerToHisFlight(passengerNo16, FlightNo4);
        flightinfo.addingPassengerToHisFlight(passengerNo17, FlightNo4);
        flightinfo.addingPassengerToHisFlight(passengerNo18, FlightNo4);
        flightinfo.addingPassengerToHisFlight(passengerNo19, FlightNo4);
        flightinfo.addingPassengerToHisFlight(passengerNo20, FlightNo4);

        System.out.println("*****************************************************"); //separator for aesthetics only

        System.out.println("\n");

        System.out.println("Displaying all flight's passengers");

        flightinfo.showAllPassengersOnFlight();


        System.out.println("*****************************************************"); //separator for aesthetics only
        
        System.out.println("\n");

        System.out.println("Removing some passengers from certain flights");
        flightinfo.removingPassengerFromFlight(passengerNo10, FlightNo2);
        flightinfo.removingPassengerFromFlight(passengerNo15, FlightNo3);
        flightinfo.removingPassengerFromFlight(PassengerNo3, FlightNo1);
        flightinfo.removingPassengerFromFlight(passengerNo20, FlightNo4);

        System.out.println("*****************************************************"); //separator for aesthetics only

        System.out.println("\n");

        System.out.println("showing all passengers and their assigned flights after deleting passengers: ");

        System.out.println("\n");

        flightinfo.showAllPassengersOnFlight();

        System.out.println("\n");


        System.out.println("*****************************************************"); //separator for aesthetics only

        System.out.println("\n");

        System.out.println("The avg of passengers for each date ");

        flightinfo.getTheAvgOfPassengers("8/9/2021");
    


        System.out.println("*****************************************************"); //separator for aesthetics only

        System.out.println("trying out the try and catch method by making violations: ");

        System.out.println("\n");

        System.out.println("*****************************************************"); //separator for aesthetics only

        System.out.println("\n");

        //violating flights dates

        System.out.println("Violating dates of flights \n");
        flightinfo.offeringANewFlight(FlightNo4, "12/1/2021");
        flightinfo.offeringANewFlight(FlightNo1, "9/9/2021");
        
        //violating passenger placements

        System.out.println("*****************************************************"); //separator for aesthetics only

        System.out.println("\n");

        System.out.println("violating passenger placements: \n");
        flightinfo.addingPassengerToHisFlight(passengerNo12, FlightNo4);
        flightinfo.addingPassengerToHisFlight(PassengerNo1, FlightNo3);

        //removing a passenger from a flight
        System.out.println("*****************************************************"); //separator for aesthetics only

        System.out.println("violating passengers on their flights placements: \n");
        flightinfo.removingPassengerFromFlight(passengerNo14, FlightNo3);
        flightinfo.removingPassengerFromFlight(passengerNo20, FlightNo4);

        //getting the avg of passenger on a date that does not exist 
        System.out.println("*****************************************************"); //separator for aesthetics only

        System.out.println("The avg of passengers: \n");
        flightinfo.getTheAvgOfPassengers("9/9/2002");


        System.out.println("*****************************************************"); //separator for aesthetics only

        System.out.println("Saving all data from the flights");

        flightinfo.savingAllData();
 
        
    }
    
}
