package carpet_cost_calculator;

public class Carpet {
    double cost;
    public Carpet(double cost){
        this.cost = (cost < 0) ? 0 : cost;

    }
    public double getCost(){
        return  cost;
    }






}