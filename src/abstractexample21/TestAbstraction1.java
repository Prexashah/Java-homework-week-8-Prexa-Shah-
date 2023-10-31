package abstractexample21;

class TestAbstraction1 {
    //In real Scenario, method is called by programmer or user
    public static void main(String[] args) {
        Shape s = new Circle1();//In real scenario, object is provided through method, e.g.,getShape() method//
        s.draw();
    }
}
