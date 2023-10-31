package encapsulaton26;

public class Encapsulation {
    //Private variables declared these can only be accessed by public methods of class//
    private String name;
    private int rollNo;
    private int age;

    //set method for name to access private variable name//
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){

        return name;
    }

    //get method for Name to access private variable age//
    public int getRollNo() {
        return rollNo;

    }
    //set method for roll to access private variable rollNo//
    public void setRollNo ( int rollNo ){
        this.rollNo = rollNo;
    }
    //Get method for age to access private variable age//
    public int GetAge () {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }



}
