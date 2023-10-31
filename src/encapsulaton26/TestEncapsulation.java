package encapsulaton26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        //Setting values of the variables//
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        //Display value of variable//
//        System.out.println("Prime's age" + obj.GetAge());
        System.out.println("Prime's rollNo:" + obj.getRollNo());
    }
}
