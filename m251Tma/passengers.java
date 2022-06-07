package m251Tma;
/** 
 * Students name : Farah Al Safwan 
 * Student ID : 20460076 
 *
 * */
public class passengers extends commonAttributs {
    // declaring the attribute address
    private String address;

    public passengers (String name, String address, String phoneNo, String nationality, String age){
        super(name,phoneNo,nationality,age);
        this.address = address;
    }

    // getter method for address 
    public String getAddress() {
        return address;
    }

    //setter method for address
    public void setAddress(String address) {
        this.address = address;
    }
    //overriding the method equals from class objects 
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof passengers)) return false;
        passengers passenger = (passengers) o;
        return getId() == passenger.getId();
    }

    //overriding toString() method 
    @Override
    public String toString() {
        return "The passport number: "+ this.getId()+ "\n"+"the name of the passenger: "+ 
        this.getName()+ "\n"+ "The address"+ this.getAddress() + 
        "\n" + "The nationality: "+this.getNationality()+ "\n" +"The age: "+ this.getAge() +"The phone number: "+ this.getPhoneNo() ;
    }

}
