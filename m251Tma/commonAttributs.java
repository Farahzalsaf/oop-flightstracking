package m251Tma;
public abstract class commonAttributs{
    // private static variable (to be shared between all objects)
    private static int idS = 1;

    // declaring the attributes
    private int id;
    private String name;
    private String phoneNo;
    private String nationality;
    private String age;

    public commonAttributs(){

    }

    public commonAttributs(String name, String phoneNo,String nationality, String age){
        this.id = idS;
        idS++;
        this.name = name;
        this.phoneNo = phoneNo;
        this.age = age;
        this.nationality = nationality;
    }
    //getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
    public String getNationality() {
        return nationality;
    }
    public String getAge() {
        return age;
    }
    //setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
   
    public void setAge(String age) {
        this.age = age;
    }



}