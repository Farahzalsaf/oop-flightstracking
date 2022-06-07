package m251Tma;


public class pilots extends commonAttributs { //extending the abstract class (common attributs) to use its attributes 
    // private attribute for the salary of the pilots
    private int stipend;
    //three-argument constructor 
    public pilots (String name, String phoneNo, int stipend, String nationality, String age){
        //invoking super, the super class is common attributes 
        super(name, phoneNo,nationality, age);
        this.stipend = stipend;
    }
    //getter and setter methods for the variable salary 
    public int getStipend() {
        return stipend;
    }
    public void setStipend(int stipend) {
        this.stipend = stipend;
    }
    //overriding the method toString() from class objects 
    @Override
    public String toString() {
    
        return "The pilot ID : "+ this.getId() +
         "\n" + 
         "The pilot's name: "+ this.getName() +"The pilots age: "+ this.getAge() +"The pilot's nationality" + this.getNationality() +
          "\n" + "The pilots phone number: "+ this.getPhoneNo() +
           "\n" + "The pilots salary: "+ this.getStipend();
    }






}